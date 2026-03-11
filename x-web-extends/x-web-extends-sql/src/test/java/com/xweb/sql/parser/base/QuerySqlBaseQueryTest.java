package com.xweb.sql.parser.base;

import com.xweb.sql.core.ItemStringUtil;
import com.xweb.sql.core.SelectUtil;
import com.xweb.sql.core.base.BaseSelect;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class QuerySqlBaseQueryTest {


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
        String sql = "select id,name from aaa where id = 222 and (age= 22 or name= 'xxx') or xx = '33' and ss = 22";
        commonCheck(sql);
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000002() {
        String sql = "select id,name from aaa where (id = 222 and  age= 22 )or name= 'xxx' ";
        commonCheck(sql);
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000003() {
        String sql = "select id, name  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id ";
        commonCheck(sql);
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000004() {
        String sql = "select id, name  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id";
        commonCheck(sql);
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000005() {
        String sql = "select id, name  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000006() {
        String sql = "select name,(select id from a where id=2) as currentId  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        commonCheck(sql);
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000007() {
        String sql = "select (case when name = 'fff' then 'a' else 'b' end) as caseName  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        commonCheck(sql);
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
}
