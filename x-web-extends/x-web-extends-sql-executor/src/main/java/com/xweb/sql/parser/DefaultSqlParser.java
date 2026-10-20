package com.xweb.sql.parser;

import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.util.CommonSqlUtil;
import com.xweb.sql.meta.Select;
import com.xweb.sql.parser.converter.util.AstConverterUtil;

public class DefaultSqlParser implements SqlParser {


    @Override
    public Select parse(String sql) {
        final Statement statement = CommonSqlUtil.commonSqlToAST(sql);
        return (Select) AstConverterUtil.convert(statement);
    }

}
