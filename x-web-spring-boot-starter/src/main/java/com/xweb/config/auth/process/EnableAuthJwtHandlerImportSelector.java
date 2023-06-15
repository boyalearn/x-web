package com.xweb.config.auth.process;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class EnableAuthJwtHandlerImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{AuthAutoConfiguration.class.getName()};
    }
}
