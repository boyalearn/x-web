package com.earth.server;


import com.earth.entity.Meta;
import com.earth.server.evt.Events;
import com.earth.server.evt.Position;
import com.earth.server.service.MetaService;
import com.earth.uitl.ContextUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@ServerEndpoint("/server/{id}")
@Getter
@Setter
@Component
public class SyncWebSocketServer {
    public static final Map<String, SyncWebSocketServer> USER_MAP = new ConcurrentHashMap<>();

    private Session session;

    private Meta meta;

    private String id;

    @OnOpen
    public void onOpen(Session session, @PathParam("id") String id) {
        this.session = session;
        this.id = id;
        USER_MAP.put(id, this);
        ContextUtil.context().getBean(MetaService.class).handle(this, Events.META_ADD, "");
    }

    @OnMessage
    public void onMessage(String message) {
        ContextUtil.context().getBean(MetaService.class).handle(this, Events.META_CMD, message);
    }

    @OnClose
    public void onClose() {
        USER_MAP.remove(this.id);
        ContextUtil.context().getBean(MetaService.class).handle(this, Events.META_LEAVE, "");
    }

    @OnError
    public void onError(Throwable e){
        e.printStackTrace();
    }

}
