/*
 * '?' 匹配前一项零次或者一次
 * '+' 匹配前一项一次或者多次
 * '*' 匹配前一项零次或者多次
 *
 */
grammar QuerySqlBase;

statement
    //查询部分
    : query                                                                                #statementDefault
    | INSERT INTO qualifiedName columnAliases? VALUES valueAliases onDuplicateCondition?   #insertIntoDefault
    | INSERT INTO qualifiedName columnAliases? query                                       #insertIntoAsQuery
    | DELETE FROM qualifiedName (WHERE booleanExpression)?                                 #deleteDefault
    | UPDATE qualifiedName SET expression ( ',' expression )?  (WHERE booleanExpression)?  #updateDefault
    | MERGE INTO target=tableExpression USING useTable=tableExpression
      ON booleanExpression matchThenExpression+                                            #mergeDefault
    ;

query
    //查询分有with和 no with
    : queryItem unionExpress*
    ;


unionExpress
    : UNION setQuantifier? queryItem
    ;

queryItem
    : queryNoWith
    ;

queryNoWith
    : queryPrimary                                                                         #singleSelect
    ;

queryPrimary
    : SELECT setQuantifier? selectItem (',' selectItem)*
      (FROM tableExpression (',' tableExpression)*)?
      (WHERE where=whereExpression)?
      (GROUP BY groupByExpression (',' groupByExpression)*)?
      orderByPart?
      (HAVING having=havingExpression)?
      ((LIMIT limit=limitRowCount) | (FETCH (FIRST | NEXT) (fetchFirst=rowCount)? (ROW | ROWS) (ONLY | WITH TIES)))?
    ;

orderByPart
    : ORDER BY orderByExpression (',' orderByExpression)*
    ;

matchThenExpression
    : WHEN NOT? MATCHED ( BY SOURCE )? THEN mergeOperator
    ;

mergeOperator
    : UPDATE KEY? SET expression (',' expression)?                                              #mergeUpdateOperator
    | DELETE                                                                               #mergeDeleteOperator
    | INSERT qualifiedName? columnAliases VALUES valueAliases                              #mergeInsertOperator
    ;


limitRowCount
    : rowCount (',' rowCount)?
    ;

rowCount
    : valueExpression
    ;

setQuantifier
    : DISTINCT
    | ALL
    ;

selectItem
    : expression (AS? identifier)?                                                         #selectSingle
    | primaryExpression '.' ASTERISK                                                       #selectAll
    | ASTERISK                                                                             #selectAll
    ;

tableExpression
    : tableExpressionExpress
    ;

tableExpressionExpress
    : left=tableExpressionExpress joinType JOIN
      right=simpleTableExpression joinCondition                                            #joinTableExpress
    | simpleTableExpression                                                                #simpleTableExpress
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
    : qualifiedName                                                                        #tableNameExpress
    | '(' tableExpression  unionTableExpress+ ')'                                          #unionSelectTableExpress
    | '(' query ')'                                                                        #subQueryTableExpress
    | '(' tableExpression ')'                                                              #subTableExpressionExpress
    ;

unionTableExpress
    : UNION setQuantifier? tableExpressPrimary
    ;

groupByExpression
    : expression
    ;

whereExpression
    : booleanExpression
    ;

orderByExpression
    : expression
    ;

havingExpression
    : booleanExpression
    ;

expression
    : booleanExpression
    ;

booleanExpression
    : valueExpression predicate[$valueExpression.ctx]?                                     #predicated
    | NOT booleanExpression                                                                #logicalNot
    | left=booleanExpression operator=AND right=booleanExpression                          #logicalBinary
    | left=booleanExpression operator=OR right=booleanExpression                           #logicalBinary
    ;

predicate[ParserRuleContext value]
    : comparisonOperator right=valueExpression                                             #comparison
    | comparisonOperator '(' query ')'                                                     #quantifiedComparison
    | NOT? BETWEEN lower=valueExpression AND upper=valueExpression                         #between
    | NOT? IN '(' expression (',' expression)* ')'                                         #inList
    | NOT? IN '(' query ')'                                                                #inSubquery
    | NOT? LIKE pattern=valueExpression (ESCAPE escape=valueExpression)?                   #like
    | IS NOT? NULL                                                                         #nullPredicate
    ;

valueExpression
    : primaryExpression                                                                    #valueExpressionDefault
    | valueExpression AT timeZoneSpecifier                                                 #atTimeZone
    | operator=(MINUS | PLUS) valueExpression                                              #arithmeticUnary
    | left=valueExpression operator=(ASTERISK | SLASH | PERCENT) right=valueExpression     #arithmeticBinary
    | left=valueExpression operator=(PLUS | MINUS) right=valueExpression                   #arithmeticBinary
    | left=valueExpression CONCAT right=valueExpression                                    #concatenationExpression
    ;

timeZoneSpecifier
    : TIME ZONE interval                                                                   #timeZoneInterval
    | TIME ZONE string                                                                     #timeZoneString
    ;

interval
    : INTERVAL sign=(PLUS | MINUS)? string from=intervalField (TO to=intervalField)?
    ;

intervalField
    : YEAR | MONTH | DAY | HOUR | MINUTE | SECOND
    ;

primaryExpression
    //新增在应用中解析的时候sql值可能是个参数
    : PARAMETER                                                                            #dynamicParameter
    //MYSQL中特殊解析
    | D_ANT identifier                                                                     #specialVariable
    | NULL                                                                                 #nullLiteral
    | identifier string                                                                    #typeConstructor
    | number                                                                               #numericLiteral
    | string                                                                               #stringLiteral
    | '(' query ')'                                                                        #subPriorityQueryExpression
    | query                                                                                #subQueryExpression
    | EXISTS '(' query ')'                                                                 #exists
    | CASE whenClause+ (ELSE elseExpression=expression)? END                               #simpleCase
    | value=primaryExpression '[' index=valueExpression (',' valueExpression)? ']'         #subScript
    | qualifiedName '(' (setQuantifier? expression (',' expression)*)? ')'                 #functionCall
    | qualifiedName '(' ')'                                                                #functionCall
    //MYSQL中特殊解析
    | identifier                                                                           #columnReference
    | base=primaryExpression '.' fieldName=identifier                                      #dereference
    | '(' expression ')'                                                                   #parenthesizedExpression
    ;

onDuplicateCondition
    : ON DUPLICATE KEY UPDATE expression ( ',' expression )?
    ;

columnAliases
    : '(' identifier (',' identifier)* ')'
    ;

valueAliases
    : '(' expression (',' expression)* ')'
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
    : '`' IDENTIFIER '`'                                                                   #unquotedIdentifier
    | IDENTIFIER                                                                           #unquotedIdentifier
    ;

string
    : STRING                                                                               #basicStringLiteral
    ;

number
    : MINUS? DECIMAL_VALUE                                                                 #decimalLiteral
    | MINUS? DOUBLE_VALUE                                                                  #doubleLiteral
    | MINUS? INTEGER_VALUE                                                                 #integerLiteral
    ;

DISTINCT
    :[Dd][Ii][Ss][Tt][Ii][Nn][Cc][Tt]
    ;

SELECT
    : [Ss][Ee][Ll][Ee][Cc][Tt]
    ;

FROM
    : [Ff][Rr][Oo][Mm];

WHERE
    : [Ww][Hh][Ee][Rr][Ee];

GROUP
    : [Gg][Rr][Oo][Uu][Pp];

ORDER
    : [Oo][Rr][Dd][Ee][Rr];

HAVING
    : [Hh][Aa][Vv][Ii][Nn][Gg];

CASE: [Cc][Aa][Ss][Ee];

WHEN: [Ww][Hh][Ee][Nn];

THEN: [Tt][Hh][Ee][Nn];

ELSE: [Ee][Ll][Ss][Ee];

END : [Ee][Nn][Dd];

AND : [Aa][Nn][Dd];

NOT : [Nn][Oo][Tt];

OR  : [Oo][Rr];

BETWEEN
    : [Bb][Ee][Tt][Ww][Ee][Ee][Nn];

IN  : [Ii][Nn];

LIKE
    : [Ll][Ii][Kk][Ee];

ESCAPE
    : [Ee][Ss][Cc][Aa][Pp][Ee];

EXISTS
    : [Ee][Xx][Ii][Ss][Tt][Ss];

ARRAY
    : [Aa][Rr][Rr][Aa][Yy];

IS  : [Ii][Ss];

AS  : [Aa][Ss];

BY  : [Bb][Yy];

NULL: [Nn][Uu][Ll][Ll];

JOIN: [Jj][Oo][Ii][Nn];

INNER
    : [Ii][Nn][Nn][Ee][Rr];

LEFT: [Ll][Ee][Ff][Tt];

OUTER
    : [Oo][Uu][Tt][Ee][Rr];

FULL: [Ff][Uu][Ll][Ll];

ON  : [Oo][Nn];

RIGHT
    : [Rr][Ii][Gg][Hh][Tt];

DUPLICATE
    : [Dd][Uu][Pp][Ll][Ii][Cc][Aa][Tt][Ee];

KEY : [Kk][Ee][Yy];

UPDATE
    : [Uu][Pp][Dd][Aa][Tt][Ee];

INSERT
    : [Ii][Nn][Ss][Ee][Rr][Tt];

INTO: [Ii][Nn][Tt][Oo];

VALUES
    : [Vv][Aa][Ll][Uu][Ee][Ss];

DELETE
    : [Dd][Ee][Ll][Ee][Tt][Ee];

SET : [Ss][Ee][Tt];

EQ  : '=';

NEQ : '<>' | '!=';

LT  : '<';

LTE : '<=';

GT  : '>';

GTE : '>=';

LIMIT
    : [Ll][Ii][Mm][Ii][Tt];

FETCH
    : [Ff][Ee][Tt][Cc][Hh];

FIRST
    : [Ff][Ii][Rr][Ss][Tt];

NEXT: [Nn][Ee][Xx][Tt];

ROW : [Rr][Oo][Ww];

ROWS: [Rr][Oo][Ww][Ss];

ONLY: [Oo][Nn][Ll][Yy];

WITH: [Ww][Ii][Tt][Hh];

TIES: [Tt][Ii][Ee][Ss];

UNION
    : [Uu][Nn][Ii][Oo][Nn];

ALL : [Aa][Ll][Ll];

INTERVAL
    : [Ii][Nn][Tt][Ee][Rr][Vv][Aa][Ll];

AT  : [Aa][Tt];

TIME: [Tt][Ii][Mm][Ee];

ZONE: [Zz][Oo][Nn][Ee];

TO  : [Tt][Oo];

YEAR: [Yy][Ee][Aa][Rr];

MONTH
    : [Mm][Oo][Nn][Tt][Hh];

DAY : [Dd][Aa][Yy];

HOUR: [Hh][Oo][Uu][Rr];

MINUTE
    : [Mm][Ii][Nn][Uu][Tt][Ee];

SECOND
    : [Ss][Ee][Cc][Oo][Nn][Dd];

MERGE
    : [Mm][Ee][Rr][Gg][Ee];

USING
    : [Uu][Ss][Ii][Nn][Gg];

MATCHED
    : [Mm][Aa][Tt][Cc][Hh][Ee][Dd];

SOURCE
    : [Ss][Oo][Uu][Rr][Cc][Ee];

PLUS: '+';

MINUS
    : '-';

ASTERISK
    : '*';

SLASH
    : '/';

PERCENT
    : '%';

CONCAT
    : '||';

PARAMETER
    : '?';

D_ANT
    : '@@';

STRING
    : '\'' ( ~'\'' | '\'\'' )* '\'';

INTEGER_VALUE
    : DIGIT+;

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