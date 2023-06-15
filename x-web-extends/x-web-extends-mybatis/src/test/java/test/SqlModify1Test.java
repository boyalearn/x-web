package test;


import com.xweb.mybatis.sql.SqlVisitor;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class SqlModify1Test {


    @Test
    public void test_addWhereCondition_0001() throws JSQLParserException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        String sql = "select u.aa from user u,goods g where g.user_id=u.id and u.id in (select user_id from goods ) and u.p=222 and u.tid=555";
        SqlVisitor sqlVisitor = new SqlVisitor(sql);
        System.out.println(sqlVisitor.addWhereCondition("user.name like '234%'"));
    }

    @Test
    public void test_0002() throws JSQLParserException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        String sql = "select u.aa from user u,goods g where g.user_id=u.id and u.id in (select user_id from goods ) and u.p=222 and u.tid=555";
        SqlVisitor sqlVisitor = new SqlVisitor(sql);
        System.out.println(sqlVisitor.addSelectItems("goods", new String[]{"bb", "cc"}));
    }

    @Test
    public void test_0003() throws JSQLParserException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        String sql = "user.p=222 and user.tid=555";
        Expression expression = CCJSqlParserUtil.parseExpression(sql);
        System.out.println(expression);

    }
}
