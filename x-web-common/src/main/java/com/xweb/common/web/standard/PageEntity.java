package com.xweb.common.web.standard;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@ApiModel(value = "分页数据")
public class PageEntity<T> {
    @ApiModelProperty(value = "数据列表")
    private List<T> list;

    @ApiModelProperty(value = "总消息条数")
    private Long total;

    @ApiModelProperty(value = "每页数据大小")
    private Long pageSize;

    @ApiModelProperty(value = "当前页数")
    private Long page;
}
