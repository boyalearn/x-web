package com.xweb.logger.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhx
 * @since 2022-09-14
 */
@Getter
@Setter
public class LoggerBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer clientId;

    private String model;

    private String option;

    private String description;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
