package com.earth.server.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.earth.entity.Meta;
import com.earth.mapper.MetaMapper;
import com.earth.server.SyncWebSocketServer;
import com.earth.server.cmd.CmdEvent;
import com.earth.server.evt.Events;
import com.earth.uitl.JSONUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xweb.common.utils.JsonUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
@AllArgsConstructor
public class MetaService {

    public static final Map<String, String> CMD_MAP = new ConcurrentHashMap<>();


    private MetaMapper metaMapper;

    public void handle(SyncWebSocketServer webSocket, Events event, String data) {
        switch (event) {
            case META_ADD:
                sendAll(buildMetaAddEventData(webSocket, Events.META_ADD));
                initEnvironment(webSocket);
                break;
            case META_CMD:
                sendAll(buildMetaCmdData(data));
                //dealCmdLogic(webSocket, data);
                break;
            case META_NULL:
                //dealCmdLogic(webSocket, data);
                break;
            case META_LEAVE:
                sendAll(buildMetaAddEventData(webSocket, Events.META_LEAVE));
                break;
            case META_SYNC:
                sendAll(buildMetaSyncData(data));
                break;
        }

    }

    private String buildMetaSyncData(String data) {
        return data;
    }

    private synchronized void dealCmdLogic(SyncWebSocketServer webSocket, String data) {
        CMD_MAP.put(webSocket.getId(), data);
        Set<String> keys = SyncWebSocketServer.USER_MAP.keySet();
        for (String key : keys) {
            if (!CMD_MAP.containsKey(key)) {
                return;
            }
        }
        try {
            final ArrayList<CmdEvent> cmdEvents = new ArrayList<>();
            cmdEvents.add(new CmdEvent(Events.META_NEXT, 0, null));
            sendAll(JSONUtil.objectToJson(cmdEvents));
            CMD_MAP.clear();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    private void initEnvironment(SyncWebSocketServer webSocket) {
        List<Meta> metas = metaMapper.selectList(new QueryWrapper<>());
        final ArrayList<CmdEvent> cmdEvents = new ArrayList<>();
        for (Meta meta : metas) {
            if (meta.getId().equals(webSocket.getId())) {
                continue;
            }
            final CmdEvent cmdEvent = new CmdEvent(Events.META_ADD, 0, meta);
            cmdEvents.add(cmdEvent);
        }
        try {
            webSocket.getSession().getBasicRemote().sendText(JsonUtil.toJSON(cmdEvents));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String buildMetaCmdData(String data) {
        return data;
    }

    private String buildMetaAddEventData(SyncWebSocketServer webSocket, Events event) {
        final Meta meta = metaMapper.selectById(webSocket.getId());
        webSocket.setMeta(meta);
        try {
            final CmdEvent cmdEvent = new CmdEvent(event, 0, meta);
            final ArrayList<CmdEvent> cmdEvents = new ArrayList<>();
            cmdEvents.add(cmdEvent);
            return JsonUtil.toJSON(cmdEvents);
        } catch (Exception e) {
            throw new RuntimeException("JSON ERROR");
        }
    }

    private void sendAll(String message) {
        SyncWebSocketServer.USER_MAP.forEach((key, value) -> {
            try {
                value.getSession().getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void sendAllNoMyself(SyncWebSocketServer socket, String message) {
        SyncWebSocketServer.USER_MAP.forEach((key, value) -> {
            try {
                if (value != socket) {
                    value.getSession().getBasicRemote().sendText(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void sendMyself(SyncWebSocketServer socket, String message) {
        try {
            socket.getSession().getBasicRemote().sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
