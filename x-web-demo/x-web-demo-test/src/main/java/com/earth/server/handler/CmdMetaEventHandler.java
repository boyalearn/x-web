package com.earth.server.handler;

import com.earth.entity.Meta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.MsgEvt;
import com.earth.server.evt.Position;
import com.earth.service.IMetaService;
import com.earth.uitl.ConnectionUtil;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.PositionHashUtil;

import java.util.Map;

/**
 * @author zouhuixing
 * @date 2024/9/11
 */
public class CmdMetaEventHandler implements EventHandler {
    @Override
    public void handle(WebSocketServer websocket, MsgEvt msgEvt) {
        Map position = (Map) ((Map) msgEvt.getData()).get("position");
        String hashCode = PositionHashUtil.positionHashCode(Double.valueOf(String.valueOf(position.get("x"))), Double.valueOf(String.valueOf(position.get("z"))), PositionHashUtil.HASH_LEN);
        System.out.println("hashCode:" + hashCode);
        ConnectionUtil.noticeAroundConnected(websocket.getId(), hashCode, msgEvt);
        saveMeta(websocket.getId(), hashCode, msgEvt);
    }


    private void saveMeta(String id, String hashCode, MsgEvt msgEvt) {
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);
        Map position = (Map) ((Map) msgEvt.getData()).get("position");
        Map quaternion = (Map) ((Map) msgEvt.getData()).get("quaternion");
        String keyState = (String) ((Map) msgEvt.getData()).get("keyState");
        if ("UP".equals(keyState)) {
            Meta meta = new Meta();
            meta.setId(id);
            meta.setX(Double.valueOf(String.valueOf(position.get("x"))));
            meta.setY(Double.valueOf(String.valueOf(position.get("y"))));
            meta.setZ(Double.valueOf(String.valueOf(position.get("z"))));
            meta.setRx(Double.valueOf(String.valueOf(quaternion.get("x"))));
            meta.setRy(Double.valueOf(String.valueOf(quaternion.get("y"))));
            meta.setRz(Double.valueOf(String.valueOf(quaternion.get("z"))));
            meta.setRw(Double.valueOf(String.valueOf(quaternion.get("w"))));
            meta.setCode(hashCode);
            metaService.updateById(meta);
        }
    }
}
