package com.earth.system;


import com.earth.entity.Meta;
import com.earth.server.WebSocketServer;
import com.earth.server.evt.Event;
import com.earth.server.evt.MsgEvt;
import com.earth.service.IMetaService;
import com.earth.uitl.ContextUtil;
import com.earth.uitl.JSONUtil;
import com.earth.uitl.MathUtil;
import com.earth.uitl.PositionHashUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
//@Component
@Slf4j
@AllArgsConstructor
public class PlaneSystem implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        IMetaService metaService = ContextUtil.context().getBean(IMetaService.class);
        String metaId = "1833192118794919938";

        Meta meta = metaService.getById(metaId);

        new Thread(() -> {

            Double startX = 20000D;
            Double startZ = 20000D;


            Double endX = 22000D;
            Double endZ = 22000D;

            Double x = startX;
            Double z = startZ;

            List<String> sendCodes = new ArrayList<>();
            List<Meta> metas = new ArrayList<>();
            metas.add(meta);
            while (true) {
                if (x > endX || z > endZ) {
                    x = startX;
                    z = startZ;
                }
                meta.setX(x);
                meta.setZ(z);
                String hashCode = PositionHashUtil.positionHashCode(x, z, PositionHashUtil.HASH_LEN);
                String[] hashCodes = PositionHashUtil.getNeighbor(MathUtil.hexToBin(hashCode));
                List<String> currentSendCode = findSimpleHashCode(hashCodes);
                List<String> leaveHashCodes = sub(sendCodes, currentSendCode);
                send(leaveHashCodes, new MsgEvt(Event.META_DELETE, metas));
                List<String> addHashCodes = sub(currentSendCode, sendCodes);
                send(addHashCodes, new MsgEvt(Event.META_ADD, metas));
                List<String> moveHashCodes = union(currentSendCode, sendCodes);
                send(moveHashCodes, new MsgEvt(Event.META_MOVE, metas));
                sendCodes.clear();
                sendCodes.addAll(currentSendCode);
                x += 10;
                z += 10;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private List<String> findSimpleHashCode(String[] hashCodes) {
        List<String> sendCodes = new ArrayList<>();
        for (WebSocketServer websocket : WebSocketServer.USER_MAP.values()) {
            for (int i = hashCodes.length - 1; i >= 0; i--) {
                if (hashCodes[i].equals(websocket.getPosition().getHashCode())) {
                    sendCodes.add(hashCodes[i]);
                }
            }
        }
        return sendCodes;
    }

    private List<String> sub(List<String> arr, List<String> sub) {
        List<String> result = new ArrayList<>();
        for (String s : arr) {
            if (!sub.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    private List<String> union(List<String> arr, List<String> sub) {
        List<String> result = new ArrayList<>();
        for (String s : arr) {
            if (sub.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    private void send(List<String> hashCodes, MsgEvt msgEvt) {
        for (WebSocketServer websocket : WebSocketServer.USER_MAP.values()) {
            if (hashCodes.contains(websocket.getPosition().getHashCode())) {
                try {
                    websocket.getSession().getBasicRemote().sendText(JSONUtil.objectToJson(msgEvt));
                } catch (IOException e) {
                    log.error("send error", e);
                }
            }
        }
    }
}
