package com.xweb.auth.server.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2022-08-27
 */
@Getter
@Setter
@TableName("client_role_user")
public class ClientRoleUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer clientId;

    private Integer roleId;

    private Integer userId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
