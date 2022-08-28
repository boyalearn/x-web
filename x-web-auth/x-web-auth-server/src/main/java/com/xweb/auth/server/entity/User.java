package com.xweb.auth.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.xweb.common.valid.Insert;
import com.xweb.common.valid.Update;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @NotEmpty(message = "账号不能为空",groups = {Insert.class, Update.class})
    private String account;

    @NotEmpty(message = "名字不能为空",groups = {Insert.class})
    private String name;

    @NotEmpty(message = "密码不能为空",groups = {Insert.class})
    private String password;


}
