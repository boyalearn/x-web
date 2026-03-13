package com.earth.uitl;

import com.earth.entity.Meta;
import com.earth.server.evt.Position;

/**
 * @author zouhuixing
 * @date 2024/9/8
 */
public final class MetaUtil {
    public static final void initPosition(Meta meta, Position position) {
        position.setId(meta.getId());
        position.setX(meta.getX());
        position.setY(meta.getY());
        position.setZ(meta.getZ());
        position.setHashCode(meta.getCode());
        position.setAroundHashCode(PositionHashUtil.getNeighbor(MathUtil.hexToBin(meta.getCode())));
    }
}
