package com.earth.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author zhx
 * @since 2024-09-03
 */
@Getter
@Setter
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String model;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private Integer userId;

    private String mode;

    private String icon;


}
