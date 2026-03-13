package com.earth.uitl;

import com.earth.entity.Meta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
@Slf4j
public final class ConnectionUtil {

    public final static void send(WebSocketServer websocket, MsgEvt message) {
        try {
            websocket.getSession().getBasicRemote().sendText(JSONUtil.objectToJson(message));
        } catch (IOException e) {
            log.error("send error.", e);
        }
    }

    public final static void send(WebSocketServer websocket, List<Meta> metas) {
        List<Meta> staticList = new ArrayList<>(metas.size());
        List<Meta> dynamicList = new ArrayList<>(metas.size());
        for (Meta meta : metas) {
            if ("LandBlock".equals(meta.getMode())) {
                staticList.add(meta);
            } else {
                dynamicList.add(meta);
            }
        }
        if (staticList.size() > 0) {
            send(websocket, new MsgEvt(Event.META_ADD, staticList));
        }
        if (dynamicList.size() > 0) {
            send(websocket, new MsgEvt(Event.META_ADD, dynamicList));
        }
    }

    public final static void noticeAroundConnected(String hashCode, MsgEvt msgEvt) {
        for (WebSocketServer websocket : WebSocketServer.USER_MAP.values()) {
            if (Arrays.stream(websocket.getPosition().getAroundHashCode()).anyMatch(item -> item.equals(hashCode))) {
                send(websocket, msgEvt);
            }
        }
    }

    public final static void noticeAroundConnected(String id, String hashCode, MsgEvt msgEvt) {
        for (WebSocketServer websocket : WebSocketServer.USER_MAP.values()) {
            if (websocket.getId().equals(id)) continue;
            if (Arrays.stream(websocket.getPosition().getAroundHashCode()).anyMatch(item -> item.equals(hashCode))) {
                send(websocket, msgEvt);
            }
        }
    }
}
