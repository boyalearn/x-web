package com.xweb.common.web.response;

import com.xweb.common.web.standard.PageEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "分页数据返回对象")
public class RespPageResult<T> {
    @ApiModelProperty(value = "消息描述")
    private String message = "success";

    @ApiModelProperty(value = "编码", notes = " 业务编码由字母加4位数值的形式 0000 正常返回 PE 参数 SE 系统 BE 业务 TE超时异常")
    private String code = "0000";

    @ApiModelProperty(value = "分页数据信息")
    private PageEntity<T> data;

    private RespPageResult(Builder<T> builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder<T> {
        private String code = "0000";

        private String message = "success";

        private PageEntity<T> data;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder data(PageEntity<T> data) {
            this.data = data;
            return this;
        }

        public RespPageResult<T> build() {
            return new RespPageResult<T>(this);
        }
    }

}
