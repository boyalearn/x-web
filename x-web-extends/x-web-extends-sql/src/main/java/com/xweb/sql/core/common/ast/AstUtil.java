package com.xweb.sql.core.common.ast;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.ast.visitor.AstVisitor;
import com.xweb.sql.core.common.ast.visitor.BaseSelectVisitor;
import com.xweb.sql.core.common.ast.visitor.IntervalExpressionVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AstUtil {

    public final static String SPACE = " ";

    public final static String DOT = ".";

    public final static String LEFT_BRACKET = "(";

    public final static String RIGHT_BRACKET = ")";

    public final static String LEFT_SQUARE_BRACKET = "[";

    public final static String RIGHT_SQUARE_BRACKET = "]";


    public final static String COMMA = ",";

    private static Map<Class, AstVisitor> VISITOR=new HashMap<>();

    static {
        VISITOR.put(BaseSelectVisitor.class,new BaseSelectVisitor());
        VISITOR.put(IntervalExpressionVisitor.class,new IntervalExpressionVisitor());
    }

    public static String toSql(Item item){
        final AstVisitor astVisitor = VISITOR.get(item.getClass());
        if(Optional.ofNullable(astVisitor).isPresent()){
            return astVisitor.visitor(item);
        }else{
            throw new RuntimeException("未实现");
        }
    }


    public static String toStringCommon(Item item) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isNotEmpty(item.getAs())) {
            stringBuffer.append(SPACE + item.getAs());
        }
        if (isNotEmpty(item.getAlias())) {
            stringBuffer.append(SPACE + item.getAlias());
        }
        return stringBuffer.toString();
    }

    public static String toStringCommon(Table item) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isNotEmpty(item.getAs())) {
            stringBuffer.append(SPACE + item.getAs());
        }
        if (isNotEmpty(item.getAlias())) {
            stringBuffer.append(SPACE + item.getAlias());
        }
        return stringBuffer.toString();
    }

    public static boolean isNotEmpty(String str) {
        return !(str == null || str.trim() == "");
    }

}
