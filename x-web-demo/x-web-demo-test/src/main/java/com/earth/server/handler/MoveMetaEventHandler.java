package com.earth.server.handler;

import com.earth.entity.Meta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.server.evt.Position;
import com.earth.service.IMetaService;
import com.earth.uitl.ConnectionUtil;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.JSONUtil;
import com.earth.uitl.MathUtil;
import com.earth.uitl.PositionHashUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
@Slf4j
public class MoveMetaEventHandler implements EventHandler {
    @Override
    public void handle(WebSocketServer websocket, MsgEvt msgEvt) {
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);

        try {
            Position position = JSONUtil.transClass(msgEvt.getData(), Position.class);
            String hashCode = PositionHashUtil.positionHashCode(Double.valueOf(position.getX()), Double.valueOf(position.getZ()), PositionHashUtil.HASH_LEN);
            if (websocket.getId().equals(position.getId())) {
                if (!Optional.ofNullable(websocket.getPosition()).isPresent()) {
                    position.setHashCode(hashCode);
                    position.setAroundHashCode(PositionHashUtil.getNeighbor(hashCode));
                    websocket.setPosition(position);
                }
                String[] oldAroundHashCode = websocket.getPosition().getAroundHashCode();
                Meta meta = this.saveMeta(hashCode, position);
                if (!websocket.getPosition().getHashCode().equals(hashCode)) {
                    this.updateWebSocketPosition(websocket, position, hashCode);
                    this.noticeCurrentAddMeta(websocket, metaService, position, oldAroundHashCode);
                    this.noticeCurrentLeaveMeta(websocket, metaService, position, oldAroundHashCode);
                }
                List<Meta> metas = new ArrayList<>();
                metas.add(meta);
                ConnectionUtil.noticeAroundConnected(websocket.getId(), hashCode, new MsgEvt(Event.META_MOVE, metas));
            } else {
                Meta meta = this.saveMeta(hashCode, position);
                List<Meta> metas = new ArrayList<>();
                metas.add(meta);
                ConnectionUtil.noticeAroundConnected(websocket.getId(), hashCode, new MsgEvt(Event.META_MOVE, metas));
            }
        } catch (JsonProcessingException e) {
            log.error("error.", e);
        }

    }

    private void updateWebSocketPosition(WebSocketServer websocket, Position position, String hashCode) {
        position.setHashCode(hashCode);
        position.setAroundHashCode(PositionHashUtil.getNeighbor(MathUtil.hexToBin(hashCode)));
        websocket.setPosition(position);
    }

    private void noticeCurrentAddMeta(WebSocketServer websocket, IMetaService metaService, Position position, String[] oldAroundHashCode) {
        List<Meta> addMetaList = metaService.listMetaByCodes(MathUtil.differenceSet(position.getAroundHashCode(), oldAroundHashCode));
        ConnectionUtil.send(websocket, addMetaList);
    }

    private void noticeCurrentLeaveMeta(WebSocketServer websocket, IMetaService metaService, Position position, String[] oldAroundHashCode) {
        List<Meta> removeMetaList = metaService.listMetaByCodes(MathUtil.differenceSet(oldAroundHashCode, position.getAroundHashCode()));
        ConnectionUtil.send(websocket, new MsgEvt(Event.META_DELETE, removeMetaList));
    }

    private Meta saveMeta(String hashCode, Position positionInfo) {
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);
        Meta meta = new Meta();
        meta.setId(positionInfo.getId());
        meta.setX(positionInfo.getX());
        meta.setY(positionInfo.getY());
        meta.setZ(positionInfo.getZ());
        meta.setRx(positionInfo.getRx());
        meta.setRy(positionInfo.getRy());
        meta.setRz(positionInfo.getRz());
        meta.setRw(positionInfo.getRw());
        meta.setCode(hashCode);
        metaService.updateById(meta);
        return meta;
    }
}
