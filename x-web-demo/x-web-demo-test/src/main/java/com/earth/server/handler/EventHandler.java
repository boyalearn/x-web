package com.earth.server.handler;

import com.earth.server.WebSocketServer;
import com.earth.server.evt.MsgEvt;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
public interface EventHandler {
    void handle(WebSocketServer websocket,MsgEvt msgEvt);
}
