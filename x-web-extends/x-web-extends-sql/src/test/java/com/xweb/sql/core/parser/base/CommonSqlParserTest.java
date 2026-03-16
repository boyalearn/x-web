package com.xweb.sql.core.parser.base;

import com.xweb.sql.core.StringUtil;
import com.xweb.sql.core.common.CommonAstToSqlVisitor;
import com.xweb.sql.core.common.Select;
import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.util.SqlUtil;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CommonSqlParserTest {


    private void commonCheck(String sql) {
        System.out.println("S:" + sql);
        Statement select = SqlUtil.readSqlToAST(sql);
        CommonAstToSqlVisitor commonAstToSqlVisitor = new CommonAstToSqlVisitor();
        String recoverSql = commonAstToSqlVisitor.visit(select);
        System.out.println("D:" + recoverSql);
        Assert.isTrue(StringUtil.replaceAllEmpty(sql).equals(StringUtil.replaceAllEmpty(recoverSql)), "恢复后不一样了");
    }

    /**
     * select
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
                "SELECT  id,x,y,z,rx,ry,rz,rw,scale_x,scale_y,scale_z,mode,code,mode_id  FROM meta     WHERE (code IN (?,?))",
                "SELECT version()",
                "SELECT SUM(found) FROM ((SELECT 1 as found FROM information_schema.tables WHERE table_schema=?) " +
                        "UNION ALL (SELECT 1 as found FROM information_schema.views WHERE table_schema=? LIMIT 1) " +
                        "UNION ALL (SELECT 1 as found FROM information_schema.table_constraints WHERE table_schema=? LIMIT 1) " +
                        "UNION ALL (SELECT 1 as found FROM information_schema.triggers WHERE trigger_schema=? LIMIT 1) " +
                        "UNION ALL (SELECT 1 as found FROM information_schema.routines WHERE routine_schema=? LIMIT 1) " +
                        "UNION ALL (SELECT 1 as found FROM information_schema.events WHERE event_schema=? LIMIT 1)) " +
                        "as all_found",
                "SELECT `installed_rank`,`version`,`description`,`type`,`script`,`checksum`,`installed_on`,`installed_by`,`execution_time`,`success` FROM `earth`.`flyway_schema_history` WHERE `installed_rank` > ? ORDER BY `installed_rank`",
                "select a.* from aaa a where ff[2,3] > 0 ",
                "SELECT 1 AS found  FROM information_schema.TABLES WHERE table_schema = 'xxx' UNION ALL " +
                        " SELECT 1 AS found FROM information_schema.views WHERE table_schema ='fff' LIMIT 1 ",
                "select num+ 100 from aaaaaaa bb where a.id + 2000= 11",
                "select num || bb || cc || '22' from aaaaaaa bb where a.id + 2000= 11",
                "select * from ccc where b.name like '%22%'",
                "select * from ccc where b.name is not null",
                "select * from ccc where b.name is null"
        };
        for (String sql : sqls) {
            commonCheck(sql);
        }
    }


    /**
     * insert
     */
    @Test
    public void test00000000002() {
        String[] sqls = {
                "INSERT INTO table_name (column1, column2) VALUES (value1, value2) " +
                "ON DUPLICATE KEY UPDATE column1 = value1, column2 = value2",
                "insert into user(id,name) select id,name from user ",
                "insert into user select * from user"
        };

        for (String sql : sqls) {
            commonCheck(sql);
        }
    }

    /**
     * delete
     */
    @Test
    public void test00000000003() {
        String[] sqls = {"delete from user",
                "delete from user where id = 2 and c = 4",
                "update user set id = '1' where id = '1'"
        };

        for (String sql : sqls) {
            commonCheck(sql);
        }
    }

    @Test
    public void test00000000004() {
        String sql = "select * from ccc b where b.id = 2 and  b.name like '%2222%'";
        commonCheck(sql);
    }

    /**
     * merge into tableb b --被操作表
     * using (select * from a) a–参照表 支持子查询
     * on a.id=b.id–关联关系
     * when matched --a,b表均匹配到做update
     * then update set b.nme= b.nme
     * when not matched–a表有 b表匹配不到做insert （也可以加上 by target）
     * then insert(id,nme) values(a.id,a.nme)
     * when not matched by source–a表没有做delete
     * then delete ;
     */
    @Test
    public void test00000000005() {
        String sql = "merge into tableb b " +
                "using (select * from a) a " +
                "on a.id=b.id " +
                "when matched " +
                "then update set b.nme= b.nme " +
                "when not matched " +
                "then insert(id,nme) values(a.id,a.nme) " +
                "when not matched by source " +
                "then delete";
        commonCheck(sql);
    }
}
