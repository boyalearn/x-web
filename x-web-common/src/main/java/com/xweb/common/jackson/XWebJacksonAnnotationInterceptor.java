package com.xweb.common.jackson;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

import java.lang.reflect.Member;
import java.util.Optional;

public class XWebJacksonAnnotationInterceptor extends JacksonAnnotationIntrospector {

    public static ThreadLocal<String[]> FIELDS = new ThreadLocal<>();


    @Override
    public boolean hasIgnoreMarker(AnnotatedMember m) {
        String[] parameterNames = FIELDS.get();
        if (Optional.ofNullable(parameterNames).isPresent()) {
            Member member = m.getMember();
            String name = member.getName();
            for (String parameterName : parameterNames) {
                if (parameterName.equals(name)) {
                    return true;
                }
            }
        }

        return false;
    }
}
