grammar SelectExpr;

sql : SELECT selectItems FROM table WHERE conditions         #sqlExpr
    | SELECT selectItems FROM table                          #sqlExpr
    ;
selectItems
    : '*'                                                    #allItem
    | selectItem (',' selectItem)*                           #selectList
    ;

selectItem
    : selectItem AS ID                                       #asAlias
    | selectItem ID                                          #alias
    | column                                                 #field
    | func                                                   #funcExpr
    | '(' sql ')'                                            #prioritySubSelect
    | sql                                                    #subSelect
    ;

func
    : ID '(' expr (',' expr)* ')';

table
    : ID;

column
    : ID                                                    #commonField
    | ID '[' expr (',' expr)* ']'                           #arrayField
    ;
expr
    : ID
    | INT
    | '(' sql ')'
    ;

conditions
    : condition (AND condition)*;

condition
    : column '=' STRING                                     #simpleCondition
    | column '=' INT                                        #simpleCondition
    | column '=' column                                     #joinCondition
    ;

SELECT
    : [Ss][Ee][Ll][Ee][Cc][Tt];

AS  : [Aa][Ss];

FROM
    : [Ff][Rr][Oo][Mm];

WHERE
    : [Ww][Hh][Ee][Rr][Ee];

AND : [Aa][Nn][Dd];

STRING
    : '\''.*?'\'';

ID  : [a-zA-Z][a-zA-Z0-9]*;

INT : [0-9]+;

WS  : [ \n]+ -> skip;