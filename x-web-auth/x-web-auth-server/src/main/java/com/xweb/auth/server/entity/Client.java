package com.xweb.auth.server.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xweb.common.valid.Insert;
import com.xweb.common.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
@ApiModel(value = "数据模型")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "应用ID")
    @TableId(value = "id", type = IdType.AUTO)
    @NotNull(message = "ID不能为空", groups = {Update.class})
    private Integer id;

    @ApiModelProperty(name = "tenant_id",value = "租户ID")
    private String tenantId;

    @ApiModelProperty(value = "应用名称")
    @NotEmpty(message = "名字不能为空", groups = {Insert.class,Update.class})
    private String name;

    @ApiModelProperty(name = "client_id",value = "应用ID")
    private String clientId;


    @ApiModelProperty(name = "client_secret",value = "应用密钥")
    private String clientSecret;

    @ApiModelProperty(name = "authorized_grant_types",value = "授权范围")
    private String authorizedGrantTypes;

    @ApiModelProperty(name = "redirect_uris",value = "授权地址")
    private String redirectUris;

    @ApiModelProperty(value = "授权范围")
    private String scope;


    @ApiModelProperty(value = "应用描述")
    private String description;

    @ApiModelProperty(name = "create_time",value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Set<String> getAuthorizedGrantTypeSet() {
        return stringToSet(this.authorizedGrantTypes);
    }

    public Set<String> getRedirectUriSet() {
        return stringToSet(this.redirectUris);
    }

    public Set<String> getScopeSet() {
        return stringToSet(this.scope);
    }

    private Set<String> stringToSet(String str) {
        if (StringUtils.isEmpty(str)) {
            return new HashSet<>();
        } else {
            return new HashSet<String>(Arrays.asList(str.split(",")));
        }
    }


}
