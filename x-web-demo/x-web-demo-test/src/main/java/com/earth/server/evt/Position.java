package com.earth.server.evt;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zouhuixing
 * @date 2024/8/21
 */
@Getter
@Setter
public class Position {
    private String id;
    private Double x;
    private Double y;
    private Double z;
    private Double rx;
    private Double ry;
    private Double rz;
    private Double rw;
    private String mode;
    private String hashCode;
    private String[] aroundHashCode;
}
