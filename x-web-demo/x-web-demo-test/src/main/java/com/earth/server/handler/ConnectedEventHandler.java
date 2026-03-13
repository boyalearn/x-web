package com.earth.server.handler;

import com.earth.entity.Meta;
import com.earth.entity.MetaExtend;
import com.earth.entity.PlayerMeta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.server.evt.Position;
import com.earth.service.IMetaExtendService;
import com.earth.service.IMetaService;
import com.earth.uitl.ConnectionUtil;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.MetaUtil;
import com.github.pagehelper.util.StringUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
public class ConnectedEventHandler implements EventHandler {
    @Override
    public void handle(WebSocketServer websocket, MsgEvt msgEvt) {
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);

        IMetaExtendService metaExtendService = ContextUtil.context().getBean(IMetaExtendService.class);
        String id = String.valueOf(msgEvt.getData());
        Meta meta = metaService.getById(id);
        MetaExtend metaExtend = metaExtendService.getById(id);
        PlayerMeta player = new PlayerMeta();
        player.init(meta);
        if (Optional.ofNullable(metaExtend).isPresent()) {
            player.setState(metaExtend.getState());
            player.setDriverId(metaExtend.getDriverId());
        }

        Position position = new Position();
        MetaUtil.initPosition(meta, position);

        websocket.setPosition(position);
        ConnectionUtil.send(websocket, new MsgEvt(Event.CONNECTED, player));
        List<Meta> metas = metaService.listMetaByCodes(position.getAroundHashCode());
        ConnectionUtil.send(websocket, metas);
        List<Meta> addMeta = new ArrayList<>();
        addMeta.add(meta);
        ConnectionUtil.noticeAroundConnected(websocket.getId(), meta.getCode(), new MsgEvt(Event.META_ADD, addMeta));
    }
}
