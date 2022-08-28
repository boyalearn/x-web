package com.xweb.common.resolver;


import com.xweb.common.exception.BusinessException;
import org.hibernate.validator.HibernateValidator;
import org.springframework.core.MethodParameter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.Optional;
import java.util.Set;

public class FormParamHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    private Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(false).buildValidatorFactory().getValidator();

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(FormBody.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Parameter parameter = methodParameter.getParameter();
        Class<?> type = parameter.getType();
        return buildParameter(methodParameter, type, nativeWebRequest, webDataBinderFactory);
    }

    public Object buildParameter(MethodParameter parameter, Class<?> pClass, NativeWebRequest request, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Object param = pClass.newInstance();
        buildInstance(pClass, param, request, webDataBinderFactory);
        Validated validated = parameter.getParameterAnnotation(Validated.class);
        if (Optional.ofNullable(validated).isPresent()) {
            Set<ConstraintViolation<Object>> validate = validator.validate(param, validated.value());
            if (!validate.isEmpty()) {
                throw new BusinessException(BusinessException.PARAMETER_EXCEPTION, validate.stream().findFirst().get().getMessage());
            }
        }
        return param;
    }

    private void buildInstance(Class<?> clazz, Object param, NativeWebRequest request, WebDataBinderFactory webDataBinderFactory) {
        if (null == clazz || Object.class == clazz) {
            return;
        }
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            setFieldValue(param, field, request, webDataBinderFactory);
        }
        buildInstance(clazz.getSuperclass(), param, request, webDataBinderFactory);
    }

    private void setFieldValue(Object param, Field field, NativeWebRequest request, WebDataBinderFactory webDataBinderFactory) {
        FormKey keyName = field.getAnnotation(FormKey.class);
        String formKeyName;
        if (Optional.ofNullable(keyName).isPresent()) {
            formKeyName = keyName.value();
        } else {
            formKeyName = camelToUnderline(field.getName());
        }
        String value = request.getParameter(formKeyName);
        if (null != value) {
            field.setAccessible(true);
            try {
                WebDataBinder binder = webDataBinderFactory.createBinder(request, value, field.getName());
                Object data = binder.convertIfNecessary(value, field.getType());
                field.set(param, field.getType().cast(data));
            } catch (Exception e) {
                throw new RuntimeException("解析参数失败");
            }
            field.setAccessible(false);
        }
    }

    public String camelToUnderline(String str) {
        if (!Optional.ofNullable(str).isPresent()) {
            return "";
        }
        int len = str.length();
        StringBuilder sb = new StringBuilder(len);
        sb.append(str.substring(0, 1).toLowerCase());
        for (int i = 1; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append("_");
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
