package com.xweb.common.web.standard;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageRequest {

    @ApiModelProperty(name = "page_size",value = "每页数据大小")
    private Long pageSize;

    @ApiModelProperty(value = "当前页数")
    private Long page;
}
