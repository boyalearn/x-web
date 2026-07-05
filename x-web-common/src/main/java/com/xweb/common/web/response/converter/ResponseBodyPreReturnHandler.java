package com.xweb.common.web.response.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xweb.common.jackson.XWebJacksonAnnotationInterceptor;
import com.xweb.common.web.response.RespPageResult;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.web.response.ResultBody;
import com.xweb.common.web.standard.PageRequest;
import lombok.AllArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.*;

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
        Set<String> layerFields = new HashSet<String>();
        boolean isSimple = true;
        if (Optional.ofNullable(resultBody).isPresent()
                && Optional.ofNullable(resultBody.field()).isPresent()
                && Optional.ofNullable(resultBody.field().exclude()).isPresent()) {
            XWebJacksonAnnotationInterceptor.FIELDS.set(resultBody.field().exclude());
            String[] fields = resultBody.field().exclude();
            for (String field : fields) {
                if (field.contains(".")) {
                    isSimple = false;
                    layerFields.add(field);
                }
            }
        }
        if (!isSimple) {
            if (data instanceof RespResult) {
                RespResult result = (RespResult) data;
                String dataString = objectMapper.writeValueAsString(result.getData());
                Map tmpData = objectMapper.readValue(dataString, Map.class);
                for (String layerField : layerFields) {
                    removeFieldValue(layerField, tmpData);
                }
                result.setData(tmpData);
            } else if (data instanceof RespPageResult) {
                RespPageResult result = (RespPageResult) data;
                if (Optional.ofNullable(result.getData()).isPresent() && Optional.ofNullable(result.getData().getList()).isPresent()) {
                    List resultList = new ArrayList();
                    List dataList = result.getData().getList();
                    for (Object itemData : dataList) {
                        String dataString = objectMapper.writeValueAsString(itemData);
                        Map tmpData = objectMapper.readValue(dataString, Map.class);
                        for (String layerField : layerFields) {
                            removeFieldValue(layerField, tmpData);
                        }
                        resultList.add(tmpData);
                    }

                    result.getData().setList(resultList);
                }
            }
        }
        response.setContentType(APPLICATION_JSON);
        response.getWriter().write(objectMapper.writeValueAsString(data));
        modelAndViewContainer.setRequestHandled(true);
        XWebJacksonAnnotationInterceptor.FIELDS.remove();

    }

    private void removeFieldValue(String field, Map data) {
        if (field.contains(".")) {
            int i = field.indexOf(".");
            removeFieldValue(field.substring(i + 1), (Map) (data.get(field.substring(0, i))));
        } else {
            data.remove(field);
        }
    }
}
