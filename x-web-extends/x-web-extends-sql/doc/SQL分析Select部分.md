总体分析
1.总体概念
SELECT item(一次或者多次) FROM tableExpression,(joinExpression(JOIN TYPE tableExpression ON booleanExpression)|,tableExpression)(一次或多次)
WHERE booleanExpression ( op booleanExpression)？
GROUP BY  groupByExpression(一次或者多次)
ORDER BY  orderByExpression(一次或者多次)
HAVING booleanExpression
pageExpression

1.1 item
1.1.1 item的组成
column(表字段)、constant（常量）、expression（表达式），select(查询表达式，或者叫子查询)

1.2 tableExpression
table,select(查询表达式)

1.3 joinExpression(JOIN TYPE tableExpression ON booleanExpression)

1.4 booleanExpression(表达式有多种。这里只是包含返回true或者false的部分)
likeExpression、notExpression、inExpression、betweenExpression、ComplexBoolExpression

1.5 groupByExpression
column(表字段)、expression(表达式)、select(查询表达式、子查询)

1.6 orderByExpression
orderItem(column|expression + ASC|DESC)

1.7 expression
caseExpression、arithmeticExpression(算术表达式)、functionCallExpression、timeExpression

1.8 pageExpression
limitExpression、offsetExpression