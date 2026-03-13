package com.earth.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zouhuixing
 * @date 2024/9/14
 */
@Getter
@Setter
public class PlayerMeta extends Meta {

    private String state;

    private String driverId;

    public void init(Meta meta) {
        super.setId(meta.getId());
        super.setX(meta.getX());
        super.setY(meta.getY());
        super.setZ(meta.getZ());
    }
}
