package com.earth.server.handler;

import com.earth.entity.MetaExtend;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.service.IMetaExtendService;
import com.earth.uitl.ConnectionUtil;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.PositionHashUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author zouhuixing
 * @date 2024/9/14
 */
public class UpdateMetaEventHandler implements EventHandler {
    @Override
    public void handle(WebSocketServer websocket, MsgEvt msgEvt) {
        IMetaExtendService metaExtendService = ContextUtil.context().getBean(IMetaExtendService.class);
        Map data = (Map) msgEvt.getData();
        Map position = (Map) data.get("position");
        String id = String.valueOf(data.get("id"));
        Map driver = (Map) data.get("driver");
        String hashCode = PositionHashUtil.positionHashCode(Double.valueOf(String.valueOf(position.get("x"))), Double.valueOf(String.valueOf(position.get("z"))), PositionHashUtil.HASH_LEN);
        System.out.println("current:" + hashCode);
        Map metaUpdate = new HashMap();
        if (Event.MODE_DRIVER_EVENT.equals(data.get("state"))) {
            MetaExtend metaExtend = new MetaExtend();
            metaExtend.setMetaId(id);
            metaExtend.setDriverId(String.valueOf(driver.get("id")));
            metaExtend.setState("DRIVER");
            metaUpdate.put("id", id);
            metaUpdate.put("driver_id", driver.get("id"));
            metaUpdate.put("state", Event.MODE_DRIVER_EVENT);
            ConnectionUtil.noticeAroundConnected(websocket.getId(), hashCode, new MsgEvt(Event.META_UPDATE, metaUpdate));
            this.addOrUpdate(metaExtendService, metaExtend);
        } else {
            MetaExtend metaExtend = new MetaExtend();
            metaExtend.setMetaId(id);
            metaExtend.setDriverId(StringUtils.EMPTY);
            metaExtend.setState(StringUtils.EMPTY);
            metaUpdate.put("id", websocket.getId());
            metaUpdate.put("driver_id", driver.get("id"));
            metaUpdate.put("state", Event.LEAVE_DRIVER_EVENT);
            System.out.println("driverId:" + driver.get("id"));
            ConnectionUtil.noticeAroundConnected(websocket.getId(), hashCode, new MsgEvt(Event.META_UPDATE, metaUpdate));
            this.addOrUpdate(metaExtendService, metaExtend);
        }
    }

    private void addOrUpdate(IMetaExtendService metaExtendService, MetaExtend metaExtend) {
        MetaExtend meta = metaExtendService.getById(metaExtend.getMetaId());
        if (Optional.ofNullable(meta).isPresent()) {
            metaExtendService.updateById(metaExtend);
        } else {
            metaExtendService.save(metaExtend);
        }
    }
}
