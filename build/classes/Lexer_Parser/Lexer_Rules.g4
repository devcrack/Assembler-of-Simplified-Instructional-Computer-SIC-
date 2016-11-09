lexer grammar Lexer_Rules;

INSTR : 'ADD'
    |  'AND'
    |  'COMP'
    |  'DIV'
    |  'J'
    |  'JEQ'
    |  'JGT'
    |  'JLT'
    |  'JSUB'
    |  'LDA'
    |  'LDCH'
    |  'LDL'
    |  'LDX'
    |  'MUL'
    |  'OR'
    |  'RD'
    |  'STA'
    |  'STCH'
    |  'STL'
    |  'STSW'
    |  'STX'
    |  'SUB'
    |  'TD'
    |  'TIX'
    |  'WD'
    ;

HEX: [A-F0-9]+'H';

DEC : [0-9]+;

ID : [A-Z0-9]+ ;        //Token para Letras

COMA: ',';

NEWLINE: '\r'? '\n' ; //Retorna una linea Nueva

//SPACE: ' '*;
WS: (' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;        

            

