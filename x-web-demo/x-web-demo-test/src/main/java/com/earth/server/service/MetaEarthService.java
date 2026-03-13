package com.earth.server.service;

import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.server.handler.AddMetaEventHandler;
import com.earth.server.handler.CmdMetaEventHandler;
import com.earth.server.handler.ConnectedEventHandler;
import com.earth.server.handler.CreateMetaEventHandler;
import com.earth.server.handler.DeleteMetaEventHandler;
import com.earth.server.handler.EventHandler;
import com.earth.server.handler.LeaveMetaEventHandler;
import com.earth.server.handler.MoveMetaEventHandler;
import com.earth.server.handler.UpdateMetaEventHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
public class MetaEarthService {

    private static Map<String, EventHandler> HANDLES = new HashMap();

    public void handle(WebSocketServer webSocket, MsgEvt evt) {
        HANDLES.get(evt.getEvent()).handle(webSocket, evt);
    }

    static {
        HANDLES.put(Event.CONNECTED, new ConnectedEventHandler());
        HANDLES.put(Event.META_ADD, new AddMetaEventHandler());
        HANDLES.put(Event.META_CMD, new CmdMetaEventHandler());
        HANDLES.put(Event.META_UPDATE, new UpdateMetaEventHandler());
        HANDLES.put(Event.META_MOVE, new MoveMetaEventHandler());
        HANDLES.put(Event.META_LEAVE, new LeaveMetaEventHandler());
        HANDLES.put(Event.META_DELETE, new DeleteMetaEventHandler());
        HANDLES.put(Event.META_CREATE, new CreateMetaEventHandler());
    }
}
