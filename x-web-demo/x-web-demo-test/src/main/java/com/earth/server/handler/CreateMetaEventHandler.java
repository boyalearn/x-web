package com.earth.server.handler;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.earth.entity.Meta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.service.IMetaService;
import com.earth.uitl.ConnectionUtil;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.JSONUtil;
import com.earth.uitl.PositionHashUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
@Slf4j
public class CreateMetaEventHandler implements EventHandler {
    @Override
    public void handle(WebSocketServer websocket, MsgEvt msgEvt) {
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);
        try {
            final Meta meta = JSONUtil.transClass(msgEvt.getData(), Meta.class);
            meta.setCode(PositionHashUtil.positionHashCode(meta.getX(), meta.getZ(), PositionHashUtil.HASH_LEN));
            if ("LandBlock".equals(meta.getMode())) {
                QueryWrapper<Meta> queryWrapper = new QueryWrapper();
                queryWrapper.lambda().eq(Meta::getMode, meta.getMode());
                queryWrapper.lambda().eq(Meta::getX, meta.getX());
                queryWrapper.lambda().eq(Meta::getY, meta.getY());
                queryWrapper.lambda().eq(Meta::getZ, meta.getZ());
                List<Meta> list = metaService.list(queryWrapper);
                if (list.size() <= 0) metaService.save(meta);
                else meta.setId(list.get(0).getId());
            } else {
                metaService.save(meta);
            }
            List<Meta> metas = new ArrayList<>();
            metas.add(meta);
            MsgEvt evt = new MsgEvt(Event.META_ADD, metas);
            ConnectionUtil.noticeAroundConnected(meta.getCode(), evt);
        } catch (JsonProcessingException e) {
            log.error("meta error.", e);
        }

    }
}
