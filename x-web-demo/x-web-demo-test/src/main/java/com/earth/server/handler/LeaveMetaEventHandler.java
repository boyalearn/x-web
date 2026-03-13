package com.earth.server.handler;

import com.earth.entity.Meta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.service.IMetaService;
import com.earth.uitl.ConnectionUtil;
import com.earth.uitl.ContextUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouhuixing
 * @date 2024/9/9
 */
public class LeaveMetaEventHandler implements EventHandler {
    @Override
    public void handle(WebSocketServer websocket, MsgEvt msgEvt) {
        List<Meta> metas = new ArrayList<>();
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);
        Meta meta = metaService.getById(websocket.getId());
        metas.add(meta);
        ConnectionUtil.noticeAroundConnected(websocket.getPosition().getHashCode(), new MsgEvt(Event.META_DELETE, metas));
    }
}
