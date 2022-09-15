package com.xweb.auth.server.bean;

import com.xweb.common.standard.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/14 10:06
 ******************************/
@Getter
@Setter
public class SystemLogPageRequest extends PageRequest {

    @ApiModelProperty(name = "start_time", value = "开始时间")
    private Date startTime;

    @ApiModelProperty(name = "ended_time", value = "结束时间")
    private Date endedTime;

    private String search;
}
