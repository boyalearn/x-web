package com.xweb.auth.server.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2022-08-28
 */
@Getter
@Setter
@TableName("role_resource")
public class RoleResource implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer roleId;

    private Integer resourceId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


}
