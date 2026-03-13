package com.earth.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zhx
 * @since 2024-08-21
 */
@Getter
@Setter
public class Meta implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Double x;

    private Double y;

    private Double z;

    private Double rx;

    private Double ry;

    private Double rz;

    private Double rw;

    private Double scaleX;

    private Double scaleY;

    private Double scaleZ;

    private String mode;

    private String code;

    @TableField("mode_id")
    private String modeId;


}
