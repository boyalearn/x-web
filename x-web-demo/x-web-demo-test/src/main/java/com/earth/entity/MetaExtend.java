package com.earth.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author zhx
 * @since 2024-09-14
 */
@Getter
@Setter
@TableName("meta_extend")
public class MetaExtend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String metaId;

    private String state;

    private String driverId;


}
