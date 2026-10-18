总体分析
1.总体概念
SELECT selectItem(一次或者多次) FROM tableItem,(joinItem(JOIN TYPE tableItem ON booleanExpression)|,tableItem)(一次或多次)
WHERE booleanExpression ( op booleanExpression)？
GROUP BY  groupItem(一次或者多次)
ORDER BY  orderItem(一次或者多次)
HAVING booleanExpression
pageExpression

1.1 selectItem
1.1.1 selectItem的组成
column(表字段)、constant（常量）、expression（表达式），select(查询表达式，或者叫子查询)

1.2 tableItem
table,select(查询表达式)

1.3 joinItem(JOIN TYPE tableItem ON booleanExpression)

1.4 booleanExpression(表达式有多种。这里只是包含返回true或者false的部分)
likeExpression、notExpression、inExpression、betweenExpression、ComplexBoolExpression,tableAssociationExpression,columnValueExpresson

1.5 groupItem(<=>selectItem)
column(表字段)、expression(表达式)、select(查询表达式、子查询)

1.6 orderItem
orderItem(column|expression + ASC|DESC)

1.7 expression
caseExpression、arithmeticExpression(算术表达式)、functionCallExpression、timeExpression,booleanExpression

1.8 pageExpression
limitExpression、offsetExpression