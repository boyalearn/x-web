package com.xweb.sql.core.convert;

public interface RewriteFilter {
    boolean support(Object object);

    Object change(Object object);


}
