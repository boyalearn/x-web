package com.xweb.common.web.response.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xweb.common.jackson.XWebJacksonAnnotationInterceptor;
import com.xweb.common.web.response.RespPageResult;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.web.response.ResultBody;
import lombok.AllArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Optional;

@AllArgsConstructor
public class ResponseBodyPreReturnHandler implements HandlerMethodReturnValueHandler {

    private static final String APPLICATION_JSON = "application/json;charset=UTF-8";

    private ObjectMapper objectMapper;

    @Override
    public boolean supportsReturnType(MethodParameter methodParameter) {
        Method method = methodParameter.getMethod();
        Class<?> returnType = method.getReturnType();
        if (returnType.isAssignableFrom(RespResult.class) || returnType.isAssignableFrom(RespPageResult.class)) {
            return true;
        }
        return false;
    }

    @Override
    public void handleReturnValue(Object data, MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest) throws Exception {
        HttpServletResponse response = nativeWebRequest.getNativeResponse(HttpServletResponse.class);
        ResultBody resultBody = methodParameter.getMethod().getAnnotation(ResultBody.class);
        if (Optional.ofNullable(resultBody).isPresent()
                && Optional.ofNullable(resultBody.field()).isPresent()
                && Optional.ofNullable(resultBody.field().exclude()).isPresent()) {
            XWebJacksonAnnotationInterceptor.FIELDS.set(resultBody.field().exclude());
        }
        response.setContentType(APPLICATION_JSON);
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(objectMapper.writeValueAsString(data));

        modelAndViewContainer.setRequestHandled(true);
        XWebJacksonAnnotationInterceptor.FIELDS.remove();
    }
}
