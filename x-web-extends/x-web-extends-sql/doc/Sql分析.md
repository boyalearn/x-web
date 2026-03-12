总体分析
1. 查询语句的总体结构
SELECT item(一次或者多次) FROM tableExpress,(JOIN TYPE tableExpress ON booleanExpress) 
WHERE booleanExpress ( op booleanExpress)？
GROUP BY  groupByExpress(一次或者多次)
ORDER BY  orderByExpress(一次或者多次)
HAVING booleanExpress

概念提出
Item最基础的代表一个表字段。可以派生出各种不同的形式比如常量表达式、case语句、函数表达式。
Table的概念（表 和子查询）
booleanExpression 这个概念提出是用于where语句后面和表关联条件、以及having语句。
OrderItem概念。字段排序（Item+ Order）


1.1查询项的组成
这里抽象一个Item概念。这个概念起源与一个表字段。因为这个概念不止用于查询项所以不能只归类于查询项中。
查询都是由Item组成的，基础的就是表字段，表字段。细分的话分为表字段、case语句

1.2 table表达式
只能式一个表 或者一个子查询

1.3where表达式的组成
where后面的语句可以理解为一个boolean表达式的复合。表达式之间的运算关系表示为 AND  OR
boolean表达式可以分为简单表达式（表字段间的关联a.id = b.id）、Not表达、In表达式、Like表达式,Exist between等、

1.4 group by 表达式
由Item表示。不需要添加新的概念。

1.5 order by
由Item表示加上 升序降序标识

1.6 having 
跟where同理。



