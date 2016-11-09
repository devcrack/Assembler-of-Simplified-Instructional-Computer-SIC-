grammar Gram_SIC;
import Lexer_Rules; 

// prog: stat+;
prog: start NEWLINE body;  // ID SPACE 'START' SPACE NUM'H' stat+;

start: ID 'START' HEX;

body : stat+ ending;


stat: instr NEWLINE 
    | directive NEWLINE 
    ;

instr:
        ID? INSTR ID  
    |   ID? INSTR ID  COMA 'X'
    |   'RSUB'
    ;

directive:
        ID 'BYTE' 'C'  '\''ID'\''        #byte_Dec
    |   ID 'BYTE' 'X'  '\''HEX'\''       #byte_Hex
    |   ID 'WORD' HEX                    #word
    |   ID 'WORD' DEC                    #word
    |   ID 'RESB' DEC                    #reserve_Bytes_Dec
    |   ID 'RESB' HEX                    #reserve_Bytes_Hex
    |   ID 'RESW' DEC                    #reserve_Words_Dec
    |   ID 'RESW' HEX                    #reserve_Words_Hex
    ;

ending: 'END' ID?;








