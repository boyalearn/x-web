package com.xweb.sql.parser.base;

import com.xweb.sql.core.ItemStringUtil;
import com.xweb.sql.core.SelectUtil;
import com.xweb.sql.core.base.BaseSelect;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class QuerySqlBaseParserTest {


    private void commonCheck(String sql) {
        BaseSelect baseSelect = SelectUtil.readToAST(sql);
        String recoverSql = ItemStringUtil.toString(baseSelect);
        System.out.println(recoverSql);
        Assert.isTrue(ItemStringUtil.replaceAllEmpty(sql).equals(ItemStringUtil.replaceAllEmpty(recoverSql)), "恢复后不一样了");
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
                "select id,name from aaa where (id = 222 and  age= 22 )or name= 'xxx'",
                "select id, name  from aaa group by name,id ",
                "select id, name  from aaa having id > 20",
                "select name,(select id from a where id=2) as currentId  from aaa",
                "select (case when name = 'fff' then 'a' else 'b' end) as caseName  from aaa  where id = 222",
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
    public void test00000000008() {
        String sql = "select nvl(name,'ss') as nvlName  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000009() {
        String sql = "select nvl(name,'ss') as nvlName  from aaa,bbb  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000010() {
        String sql = "select nvl(name,'ss') as nvlName  from aaa a left join bbb b on a.id= b.id and a.cc=b.cc left join ccc c on a.id = c.id  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000011() {
        String sql = "select nvl(name,'ss') as nvlName  from fff,aaa a left join bbb b on a.id= b.id and a.cc=b.cc left join ccc c on a.id = c.id  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000012() {
        String sql = "select nvl(name,'ss') as nvlName  from aaa a ,(select * from bbb where cc=33) b where a.id=b.id";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000013() {
        String sql = "select nvl(name,'ss') as nvlName  from aaa a ,(select * from bbb where cc=33) b where a.id=b.id and b.id between 1 and 2";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000014() {
        String sql = "select nvl(a.name,'ss') as nvlName  from aaa a ,(select * from bbb where cc=33) b where a.id=b.id and b.id between 1 and 2";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000015() {
        String sql = "select nvl(a.name[1],'ss') as nvlName  from aaa a ,(select cc[2,3] as subcc from bbb where cc[2,3]=33) b where a.id=b.id and b.id between 1 and 2";
        commonCheck(sql);
    }
}
