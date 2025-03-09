grammar W3CEbnf;
ebnf: grammarProduct+ EOF;
grammarProduct: (LBRACKET NUMBERS RBRACKET)? NAME ASSIGNMENT sequence;
sequence:
    sequence (OR_OP sequence)+
    | sequence sequence
    | sequence MINUS sequence
    | sequence (STAR | PLUS | QMARK)
    | LPAREN sequence RPAREN
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
WS: [ \t]+ -> channel(HIDDEN);
NL: [\n\r]+ -> channel(HIDDEN);
COMMENT: '/*' .*? '*/' -> channel(HIDDEN);

OTHER: .;
