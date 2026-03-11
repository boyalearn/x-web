/*
 * '?' 匹配前一项零次或者一次
 * '+' 匹配前一项一次或者多次
 * '*' 匹配前一项零次或者多次
 *
 */
grammar QuerySqlBase;

statement
    //查询部分
    : query                                              #select
    ;

query
    //查询分有with和 no with
    : queryNoWith
    ;

queryNoWith
    : SELECT setQuantifier? selectItem (',' selectItem)*
      (FROM tableExpression (',' tableExpression)*)?
      (WHERE where=whereExpression)?
      (GROUP BY groupByExpression (',' groupByExpression)*)?
      (ORDER BY orderByExpression (',' orderByExpression)*)?
      (HAVING having=havingExpression)?
    ;


setQuantifier
    : DISTINCT
    ;

selectItem
    : expression (AS? identifier)?                          #selectSingle
    | primaryExpression '.' ASTERISK                        #selectAll
    | ASTERISK                                              #selectAll
    ;

tableExpression
    : tableExpressionExpress
    ;
tableExpressionExpress
    : left=tableExpressionExpress joinType JOIN
      right=simpleTableExpression joinCondition             #joinTableExpress
    | simpleTableExpression                                 #simpleTableExpress
    ;

joinType
    : INNER?
    | LEFT OUTER?
    | RIGHT OUTER?
    | FULL OUTER?
    ;

joinCondition
    : ON booleanExpression
    ;

simpleTableExpression
    : aliasedTableExpression
    ;

aliasedTableExpression
    : tableExpressPrimary (AS? identifier)?
    ;

tableExpressPrimary
    : qualifiedName                                                   #tableNameExpress
    | '(' query ')'                                                   #subQueryTableExpress
    | '(' tableExpression ')'                                         #subTableExpressionExpress
    ;

groupByExpression
    : expression                                            #groupByExpress
    ;

whereExpression
    : booleanExpression                                     #whereExpress
    ;

orderByExpression
    : expression                                            #orderByExpress
    ;

havingExpression
    : booleanExpression                                     #havingExpress
    ;

expression
    : booleanExpression
    ;

booleanExpression
    : valueExpression predicate[$valueExpression.ctx]?                             #predicated
    | NOT booleanExpression                                                        #logicalNot
    | left=booleanExpression operator=AND right=booleanExpression                  #logicalBinary
    | left=booleanExpression operator=OR right=booleanExpression                   #logicalBinary
    ;

predicate[ParserRuleContext value]
    : comparisonOperator right=valueExpression                                      #comparison
    | comparisonOperator '(' query ')'                                              #quantifiedComparison
    | NOT? BETWEEN lower=valueExpression AND upper=valueExpression                  #between
    | NOT? IN '(' expression (',' expression)* ')'                                  #inList
    | NOT? IN '(' query ')'                                                         #inSubquery
    | NOT? LIKE pattern=valueExpression (ESCAPE escape=valueExpression)?            #like
    | IS NOT? NULL                                                                  #nullPredicate
    ;

valueExpression
    : primaryExpression                                                                   #valueExpressionDefault
    ;

primaryExpression
    : NULL                                                                                #nullLiteral
    | identifier string                                                                   #typeConstructor
    | number                                                                              #numericLiteral
    | string                                                                              #stringLiteral
    | '(' query ')'                                                                       #subSupQueryExpression
    | query                                                                               #subQueryExpression
    | EXISTS '(' query ')'                                                                #exists
    | CASE whenClause+ (ELSE elseExpression=expression)? END                              #simpleCase
    | value=primaryExpression '[' index=valueExpression ']'                               #subscript
    | qualifiedName '(' (setQuantifier? expression (',' expression)*)? ')'                #functionCall
    | identifier                                                                          #columnReference
    | base=primaryExpression '.' fieldName=identifier                                     #dereference
    | '(' expression ')'                                                                  #parenthesizedExpression
    ;

whenClause
    : WHEN condition=expression THEN result=expression
    ;

qualifiedName
    : identifier ('.' identifier)*
    ;

comparisonOperator
    : EQ | NEQ | LT | LTE | GT | GTE
    ;

identifier
    : IDENTIFIER             #unquotedIdentifier
    ;

string
    : STRING                                #basicStringLiteral
    ;

number
    : MINUS? DECIMAL_VALUE  #decimalLiteral
    | MINUS? DOUBLE_VALUE   #doubleLiteral
    | MINUS? INTEGER_VALUE  #integerLiteral
    ;

DISTINCT
    :[Dd][Ii][Ss][Tt][Ii][Nn][Cc][Tt]
    ;

SELECT
    : [Ss][Ee][Ll][Ee][Cc][Tt]
    ;

FROM
    : [Ff][Rr][Oo][Mm]
    ;

WHERE
    : [Ww][Hh][Ee][Rr][Ee]
    ;

GROUP
    : [Gg][Rr][Oo][Uu][Pp]
    ;

ORDER
    : [Oo][Rr][Dd][Ee][Rr]
    ;

HAVING
    : [Hh][Aa][Vv][Ii][Nn][Gg]
    ;

CASE: [Cc][Aa][Ss][Ee];
WHEN: [Ww][Hh][Ee][Nn];
THEN: [Tt][Hh][Ee][Nn];
ELSE: [Ee][Ll][Ss][Ee];
END : [Ee][Nn][Dd];
AND : [Aa][Nn][Dd];
NOT : [Nn][Oo][Tt];
OR  : [Oo][Rr];
BETWEEN
    : [Bb][Ee][Tt][Ww][Ee][Ee][Nn]
    ;
IN  : [Ii][Nn];
LIKE
    : [Ll][Ii][Kk][Ee]
    ;

ESCAPE
    : [Ee][Ss][Cc][Aa][Pp][Ee]
    ;

EXISTS
    : [Ee][Xx][Ii][Ss][Tt][Ss]
    ;

MINUS
    : [Mm][Ii][Nn][Uu][Ss]
    ;

ARRAY
    : [Aa][Rr][Rr][Aa][Yy]
    ;

IS  : [Ii][Ss];

AS  : [Aa][Ss];
BY  : [Bb][Yy];
NULL: [Nn][Uu][Ll][Ll];

JOIN: [Jj][Oo][Ii][Nn];
INNER
    : [Ii][Nn][Nn][Ee][Rr]
    ;
LEFT: [Ll][Ee][Ff][Tt];
OUTER
    : [Oo][Uu][Tt][Ee][Rr]
    ;
FULL: [Ff][Uu][Ll][Ll];
ON  : [Oo][Nn];

RIGHT
    : [Rr][Ii][Gg][Hh][Tt]
    ;

EQ  : '=';
NEQ : '<>' | '!=';
LT  : '<';
LTE : '<=';
GT  : '>';
GTE : '>=';

ASTERISK
    : '*'
    ;

STRING
    : '\'' ( ~'\'' | '\'\'' )* '\''
    ;

INTEGER_VALUE
    : DIGIT+
    ;

DECIMAL_VALUE
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

DOUBLE_VALUE
    : DIGIT+ ('.' DIGIT*)? EXPONENT
    | '.' DIGIT+ EXPONENT
    ;

IDENTIFIER
    : (LETTER | '_') (LETTER | DIGIT | '_')*
    ;

fragment EXPONENT
    : 'E' [+-]? DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [A-Za-z]
    ;

WS  : [ \r\n\t]+ -> channel(HIDDEN);