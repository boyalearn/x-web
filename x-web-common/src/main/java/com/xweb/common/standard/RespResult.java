package com.xweb.common.standard;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "数据返回对象")
public class RespResult<T> {
    @ApiModelProperty(value = "消息描述")
    private String message = "success";

    @ApiModelProperty(value = "编码", notes = " 业务编码由字母加4位数值的形式 0000 正常返回 PE 参数 SE 系统BE 业务 TE超时异常")
    private String code = "0000";

    @ApiModelProperty(value = "数据信息")
    private T data;

    private RespResult(Builder<T> builder) {
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

        private T data;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder data(T data) {
            this.data = data;
            return this;
        }

        public RespResult<T> build() {
            return new RespResult<T>(this);
        }
    }
}
