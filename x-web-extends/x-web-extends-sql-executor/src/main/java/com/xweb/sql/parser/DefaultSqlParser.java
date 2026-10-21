package com.xweb.sql.parser;

import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.util.CommonSqlUtil;
import com.xweb.sql.meta.Node;
import com.xweb.sql.parser.converter.util.NodeUtil;

public class DefaultSqlParser implements SqlParser {


    @Override
    public Node parse(String sql) {
        final Statement statement = CommonSqlUtil.commonSqlToAST(sql);
        return  NodeUtil.convert(statement);
    }

}
