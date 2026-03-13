package com.xweb.sql.core.parser.base;

import com.xweb.sql.core.StringUtil;
import com.xweb.sql.core.common.CommonAstToSqlVisitor;
import com.xweb.sql.core.common.Select;
import com.xweb.sql.core.common.util.SqlUtil;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CommonSqlParserTest {


    private void commonCheck(String sql) {
        System.out.println(sql);
        Select select = SqlUtil.readSqlToAST(sql);
        CommonAstToSqlVisitor commonAstToSqlVisitor = new CommonAstToSqlVisitor();
        String recoverSql = commonAstToSqlVisitor.visit(select);
        System.out.println(recoverSql);
        Assert.isTrue(StringUtil.replaceAllEmpty(sql).equals(StringUtil.replaceAllEmpty(recoverSql)), "恢复后不一样了");
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000001() {
        String[] sqls = {
                "select id,name from aaa where id = 222",
                "select * from aaa",
                "select a.* from aaa a",
                "select 1",
                "select id,name from aaa where (id = 222 and  age= 22 ) or name= 'xxx'",
                "select id, name  from aaa group by name,id ",
                "select id, name  from aaa having id > 20",
                "select name,(select id from a where id=2) as currentId  from aaa",
                "select (case when name = 'fff' then 'a' else 'b' end) as caseName  from aaa  where id = 222",
                "select nvl(name,'ss') as nvlName  from aaa a ,(select * from bbb where cc=33) b where a.id=b.id",
                "select * from aaa where b.id between 1 and 2",
                "select a.* from aaa a where ff[2,3] > 0 ",
        };
        for (String sql : sqls) {
            commonCheck(sql);
        }
    }


    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000002() {
        String sql = "select nvl(name,'ss') as nvlName  from aaa a ,(select * from bbb where cc=33) b where a.id=b.id";
        commonCheck(sql);
    }
}
