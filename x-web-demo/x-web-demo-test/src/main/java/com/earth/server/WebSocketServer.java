package com.earth.server;

import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.server.evt.Position;
import com.earth.server.service.MetaEarthService;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.JSONUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * id 为控制角色的MetaId
 */
@Slf4j
@ServerEndpoint("/websocket/{id}")
@Getter
@Setter
@Component
public class WebSocketServer {

    public static final Map<String, WebSocketServer> USER_MAP = new ConcurrentHashMap<>();

    private Session session;

    private Position position;

    private String id;

    @OnOpen
    public void onOpen(Session session, @PathParam("id") String id) {
        this.session = session;
        this.id = id;
        USER_MAP.put(id, this);
        ContextUtil.context().getBean(MetaEarthService.class).handle(this, new MsgEvt(Event.CONNECTED, this.id));
    }

    @OnMessage
    public void onMessage(String message) {
        try {
            ContextUtil.context().getBean(MetaEarthService.class).handle(this, JSONUtil.jsonToObject(message, MsgEvt.class));
        } catch (JsonProcessingException e) {
            log.error("error", e);
        }
    }

    @OnClose
    public void onClose() {
        USER_MAP.remove(this.id);
        ContextUtil.context().getBean(MetaEarthService.class).handle(this, new MsgEvt(Event.META_LEAVE, this.id));
    }


}
