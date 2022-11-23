package com.web.api.client.configuration;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignConfiguration {
    //@Bean
    public ErrorDecoder feignError() {
        return new FeignErrorDecoder();
    }


    public class FeignErrorDecoder implements ErrorDecoder {

        @Override
        public Exception decode(String key, Response response) {
            System.out.println(key);
            System.out.println(response.status());
            return null;
        }
    }
}
