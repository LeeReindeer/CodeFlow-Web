// a Java like grammar
grammar CodeFlow;

import CommonLexer;

@header {
package moe.leer.codeflow.core;
}

accessModifiers
    : PUBLIC
    | PROTECTED
    | PRIVATE
    ;

functionDeclare
    : (accessModifiers? ((STATIC? FINAL?)|(FINAL? STATIC?))) typeOrVoid IDENTIFIER formalParams ('[' ']')*
      (THROWS qualifiedNameList)?
      functionBody
    ;

functionBody
    : block
    | ';'
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParams
    : '(' formalParamList? ')'
    ;

formalParamList
    : formalParam (',' formalParam)* (',' lastFormalParam)?
    ;

formalParam
    : variableModifier? variableType variableDeclaratorId
    ;

lastFormalParam
    : variableModifier? variableType '...' variableDeclaratorId
    ;

variableModifier
    : FINAL
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

fieldDeclare
    : (accessModifiers? ((STATIC? FINAL?)|(FINAL? STATIC?)))  variableDeclarators ';'?
    ;

constructorDeclare
    : IDENTIFIER formalParams (THROWS qualifiedNameList)? constructorBody=block
    ;

variableDeclarators
    : variableType variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    // fixme this
    | (THIS|IDENTIFIER)('.'IDENTIFIER)+
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

// Statement

toplevelStatement
    : blockStatements
    ;

block
    : '{' blockStatements '}'
    ;

blockStatements
    : blockStatement*
    ;

blockStatement
    : variableDeclarators ';'?
    | statement
    | functionDeclare
    | fieldDeclare
//    | classDeclare
    ;

statement
    : blockLabel=block
    | ifBlock
    | forBlock
    | whileBlock
    | doWhileBlock
    | RETURN expression? ';'?
    | BREAK IDENTIFIER? ';'?
    | SEMI
    | statementExpression=expression ';'? // 表达式语句
    | identifierLabel=IDENTIFIER ':' statement // label
    ;

ifBlock
    : IF parBooleanExpression statement (ELSE statement)?
    ;

forBlock
    : FOR '(' forExpression ')' statement
    ;

whileBlock
    : WHILE parBooleanExpression statement
    ;

doWhileBlock
    :  DO statement WHILE parBooleanExpression
    ;

forExpression
    : enhancedForExpression
    | forInit? ';' forCondition=booleanExpression? ';' forUpdate=expressionList?
    ;

enhancedForExpression
    : variableType variableDeclaratorId ':' expression
    ;

forInit
    : variableDeclarators
    | expressionList
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

parBooleanExpression
    : '(' booleanExpression ')'
    ;

booleanExpression
    : BOOL_LITERAL
    | IDENTIFIER
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression // <<, >>>, >>
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&&' expression
    | expression bop='||' expression
    ;

// 优先级以产生式的顺序来表达
// bop -> binary op
expression
    //fixme support this
    : primary
    | expression '[' expression ']' // array
    | functionCall
    | '(' expression ')'
    | expression postfix=('++'|'--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('!'|'~') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression // <<, >>>, >>
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | expression bop='?' expression ':' expression
    | <assoc=right> expression //所有赋值运算都是右结合，先计算右边的值
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    ;

functionCall
    : IDENTIFIER '(' expressionList? ')'
    | THIS '(' expressionList? ')'  // this()
    | SUPER '(' expressionList? ')' // super call
    ;

expressionList
    : expression (',' expression)*
    ;

// TYPE

typeList
    : variableType (',' variableType)*
    ;

variableType
    : (classOrInterfaceType | primitiveType) ('[' ']')*
    |
    ;

classOrInterfaceType
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

typeOrVoid
    : variableType
    | 'void'
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    | STRING
    ;

primary
    : literal
    | IDENTIFIER
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;