package com.xweb.common.web.response.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xweb.common.jackson.XWebJacksonAnnotationInterceptor;
import com.xweb.common.web.response.OpType;
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
import java.util.*;

@AllArgsConstructor
public class ResponseBodyPreReturnHandler implements HandlerMethodReturnValueHandler {

    private static final String APPLICATION_JSON = "application/json;charset=UTF-8";

    private static final String DOT = ".";

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
        if (Optional.ofNullable(resultBody).isPresent() && Optional.ofNullable(resultBody.fields()).isPresent()) {
            if (resultBody.op() == OpType.EXCLUDE) {
                dealExcludeParameter(data, resultBody.fields());
            } else {
                dealIncludeParameter(data, resultBody.fields());
            }
        }
        response.setContentType(APPLICATION_JSON);
        response.getWriter().write(objectMapper.writeValueAsString(data));
        modelAndViewContainer.setRequestHandled(true);
        XWebJacksonAnnotationInterceptor.FIELDS.remove();

    }

    private void dealIncludeParameter(Object data, String[] fields) throws JsonProcessingException {
        if (data instanceof RespResult) {
            RespResult result = (RespResult) data;
            String dataString = objectMapper.writeValueAsString(result.getData());
            Map finalData = new HashMap();
            Map tmpData = objectMapper.readValue(dataString, Map.class);
            for (String field : fields) {
                copyFieldValue(finalData, tmpData, field);
            }
            result.setData(finalData);
        } else if (data instanceof RespPageResult) {
            RespPageResult result = (RespPageResult) data;
            if (Optional.ofNullable(result.getData()).isPresent() && Optional.ofNullable(result.getData().getList()).isPresent()) {
                List resultList = new ArrayList();
                List dataList = result.getData().getList();
                for (Object itemData : dataList) {
                    String dataString = objectMapper.writeValueAsString(itemData);
                    Map finalData = new HashMap();
                    Map tmpData = objectMapper.readValue(dataString, Map.class);
                    for (String field : fields) {
                        copyFieldValue(finalData, tmpData, field);
                    }
                    resultList.add(finalData);
                }
                result.getData().setList(resultList);
            }
        }
    }

    private void dealExcludeParameter(Object data, String[] fields) throws JsonProcessingException {
        if (data instanceof RespResult) {
            RespResult result = (RespResult) data;
            String dataString = objectMapper.writeValueAsString(result.getData());
            Map tmpData = objectMapper.readValue(dataString, Map.class);
            for (String field : fields) {
                removeFieldValue(field, tmpData);
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
                    for (String field : fields) {
                        removeFieldValue(field, tmpData);
                    }
                    resultList.add(tmpData);
                }
                result.getData().setList(resultList);
            }
        }
    }

    private void removeFieldValue(String field, Map data) {
        if (field.contains(DOT)) {
            int i = field.indexOf(DOT);
            removeFieldValue(field.substring(i + 1), (Map) (data.get(field.substring(0, i))));
        } else {
            data.remove(field);
        }
    }

    private void copyFieldValue(Map dest, Map source, String field) {
        if (Optional.ofNullable(source).isPresent()) {
            if (field.contains(DOT)) {
                int i = field.indexOf(DOT);
                String nextField = field.substring(i + 1);
                String currField = field.substring(0, i);
                Map nextDest = (Map) dest.get(currField);
                if (nextDest == null) {
                    nextDest = new HashMap();
                    dest.put(currField, nextDest);
                }
                copyFieldValue(nextDest, (Map) (source.get(currField)), nextField);
            } else {
                dest.put(field, source.get(field));
            }
        }
    }
}
