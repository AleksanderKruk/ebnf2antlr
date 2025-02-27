grammar IsoEbnf;
ebnf: rule+ EOF;
rule: (LBRACKET NUMBERS RBRACKET)? NAME ASSIGNMENT expr;
expr:
    expr (OR_OP expr)+
    | expr expr
    | expr MINUS expr
    | expr (STAR | PLUS | QMARK)
    | LPAREN expr RPAREN
    | NAME
    | TERMINAL
    | LITERAL;

LITERAL: '"' ('\\"' | ~'"')+ '"';
TERMINAL: '\'' ('\\\'' | ~'\'')+ '\'';
NAME: [\p{alpha}\p{General_Category=Other_Letter}]
      [\p{alnum}\p{General_Category=Other_Letter}]*;
NUMBERS: [0-9]+;

OR_OP: '|';
MINUS: '-';
STAR: '*';
PLUS: '+';
QMARK: '?';


ASSIGNMENT: '::=';
LBRACKET: '[';
RBRACKET: ']';
LPAREN: '(';
RPAREN: ')';
WS: [ \t]+ -> skip;
NL: [\n\r]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;

OTHER: .;
