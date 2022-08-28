package com.xweb.common.process;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

public class EnableGlobalExceptionHandlerImportSelector implements ImportSelector {

    private static final String ENABLE_KEY = "value";

    public static Boolean ENABLE;

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        MultiValueMap<String, Object> multiValueMap = annotationMetadata.getAllAnnotationAttributes(EnableGlobalExceptionHandler.class.getName());
        ENABLE = Boolean.valueOf(multiValueMap.get(ENABLE_KEY).get(0).toString());
        return new String[]{CommonConfigurationProcessor.class.getName()};
    }
}
