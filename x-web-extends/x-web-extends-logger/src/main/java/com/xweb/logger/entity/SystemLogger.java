package com.xweb.logger.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author zhx
 * @since 2022-09-13
 */
@Getter
@Setter
@TableName("system_logger")
public class SystemLogger implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer clientId;

    private String model;

    @TableField(value = "`option`")
    private String option;

    private String description;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
