package com.earth.server.handler;

import com.earth.entity.Meta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.service.IMetaService;
import com.earth.uitl.ConnectionUtil;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.JSONUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
@Slf4j
public class DeleteMetaEventHandler implements EventHandler {
    @Override
    public void handle(WebSocketServer websocket, MsgEvt msgEvt) {
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);

        try {
            Meta meta = JSONUtil.transClass(msgEvt.getData(), Meta.class);
            if ("Robot".equals(meta.getMode())) {
                return;
            }
            metaService.removeById(meta.getId());
            List<Meta> metas = new ArrayList<>();
            metas.add(meta);
            ConnectionUtil.send(websocket, new MsgEvt(Event.META_DELETE, metas));
        } catch (JsonProcessingException e) {
            log.error("delete error.", e);
        }

    }
}
