/*
 * '?' 匹配前一项零次或者一次
 * '+' 匹配前一项一次或者多次
 * '*' 匹配前一项零次或者多次
 *
 */
grammar SqlBase;

statement
    //查询部分
    : query
    ;

query
    //查询分有with和 no with
    : queryNoWith
    ;

queryNoWith
    : queryTerm
    ;

queryTerm
    : queryPrimary                                                             #queryTermDefault
    ;

queryPrimary
    : querySpecification                   #queryPrimaryDefault
    | '(' queryNoWith  ')'                 #subquery
    ;



querySpecification
    : SELECT setQuantifier? selectItem (',' selectItem)*
      (FROM relation (',' relation)*)?
      (WHERE where=booleanExpression)?
      (GROUP BY selectItem (',' selectItem)*)?
      (ORDER BY sortItem (',' sortItem)*)?
      (HAVING having=booleanExpression)?
    ;

relation
    : left=relation
      ( joinType JOIN rightRelation=relation joinCriteria
      )                                           #joinRelation
    | sampledRelation                             #relationDefault
    ;

sortItem
    : expression ordering=(ASC | DESC)?
    ;

sampledRelation
    : aliasedRelation
    ;

aliasedRelation
    : relationPrimary (AS? identifier)?
    ;

relationPrimary
    : qualifiedName                                                   #tableName
    | '(' query ')'                                                   #subqueryRelation
    ;

qualifiedName
    //可能有带数据库的表
    : identifier ('.' identifier)*
    ;

joinType
    : INNER?
    | LEFT OUTER?
    | RIGHT OUTER?
    | FULL OUTER?
    ;

joinCriteria
    : ON booleanExpression
    | USING '(' identifier (',' identifier)* ')'
    ;

selectItem
    : expression (AS? identifier)?                          #selectSingle
    ;

expression
    : booleanExpression
    ;

booleanExpression
    : valueExpression predicate?                                   #predicated
    | NOT booleanExpression                                        #logicalNot
    | left=booleanExpression operator=AND right=booleanExpression  #logicalBinary
    | left=booleanExpression operator=OR right=booleanExpression   #logicalBinary
    ;
predicate
    : comparisonOperator right=valueExpression                      #comparison
    ;

comparisonOperator
    : EQ | NEQ | LT | LTE | GT | GTE
    ;

valueExpression
    : primaryExpression                                                                 #valueExpressionDefault
    ;

primaryExpression
    : NULL                                                                                #nullLiteral
    | identifier ('[' INTEGER_VALUE (',' INTEGER_VALUE)? ']')                             #indexConstructor
    | identifier                                                                          #typeConstructor
    | INTEGER_VALUE                                                                       #numLiteral
    | string                                                                              #stringLiteral
    | 'COUNT(*)'                                                                          #countLiteral
    | '*'                                                                                 #selectAllLiteral
    ;

string
    : STRING                                #basicStringLiteral
    ;

setQuantifier
    : DISTINCT
    ;

identifier
    : IDENTIFIER             #unquotedIdentifier
    ;

EQ  : '=';
NEQ : '<>' | '!=';
LT  : '<';
LTE : '<=';
GT  : '>';
GTE : '>=';

ORDER: 'ORDER';
GROUP: 'GROUP';
BY: 'BY';
DISTINCT: 'DISTINCT';
WITH: 'WITH';
SELECT: 'SELECT';
FROM: 'FROM';
INNER: 'INNER';
OUTER: 'OUTER';
LEFT: 'LEFT';
RIGHT: 'RIGHT';
FULL: 'FULL';
ASC: 'ASC';
DESC: 'DESC';
HAVING: 'HAVING';
JOIN: 'JOIN';
AS: 'AS';
ON: 'ON';
USING: 'USING';
WHERE: 'WHERE';
AND: 'AND';
OR: 'OR';
NOT: 'NOT';
NULL: 'NULL';

IDENTIFIER
    : (LETTER | '_') (LETTER | DIGIT | '_' )*
    ;

STRING
    : '\'' ( ~'\'' | '\'\'' )* '\''
    ;

INTEGER_VALUE
    : DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [A-Za-z]
    ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;