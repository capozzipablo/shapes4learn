grammar Gramatica;

options
{
  language = Java;
}

prog: start ;

start: sentenciacreateshape   
        | sentenciacreaterectangle 
        | sentenciacreatecircle 
        | sentenciasetcolorshape 
        | sentenciasetcolorrectangle
        | sentenciasetcolorcircle 
        | sentenciasetbase 
        | sentenciasetheight 
        | sentenciasetradius 
        | sentenciasetposition 
        ;
         
    
sentenciacreateshape : CREATE SHAPE ID ;
sentenciacreaterectangle : CREATE RECTANGLE ID ;
sentenciacreatecircle : CREATE CIRCLE ID ;
sentenciasetcolorshape : SETCOLOR COLORDEF IN SHAPE ID ;
sentenciasetcolorrectangle : SETCOLOR COLORDEF IN RECTANGLE ID ;
sentenciasetcolorcircle : SETCOLOR COLORDEF IN CIRCLE ID ;
sentenciasetbase : SETBASE EXPRESIONNUMERICA IN RECTANGLE ID ;
sentenciasetheight : SETHEIGHT EXPRESIONNUMERICA IN RECTANGLE ID ;
sentenciasetradius : SETRADIUS EXPRESIONNUMERICA IN CIRCLE ID ;
sentenciasetposition : SETPOSITION EXPRESIONNUMERICA COMA EXPRESIONNUMERICA IN RECTANGLE ID     ;


CREATE: ('C'|'c')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e');
SHAPE: ('S'|'s')('H'|'h')('A'|'a')('P'|'p')('E'|'e');
RECTANGLE: ('R'|'r')('E'|'e')('C'|'c')('T'|'t')('A'|'a')('N'|'n')('G'|'g')('L'|'l')('E'|'e');
CIRCLE: ('C'|'c')('I'|'i')('R'|'r')('C'|'c')('L'|'l')('E'|'e');
SETCOLOR:('S'|'s')('E'|'e')('T'|'t')('C'|'c')('O'|'o')('L'|'l')('O'|'o')('R'|'r');
COLORDEF:('#')('0'..'6'|'a'..'f'|'A'..'F')('0'..'6'|'a'..'f'|'A'..'F')('0'..'6'|'a'..'f'|'A'..'F')('0'..'6'|'a'..'f'|'A'..'F')('0'..'6'|'a'..'f'|'A'..'F')('0'..'6'|'a'..'f'|'A'..'F');
SETBASE:('S'|'s')('E'|'e')('T'|'t')('B'|'b')('A'|'a')('S'|'s')('E'|'e');
SETHEIGHT: ('S'|'s')('E'|'e')('T'|'t')('H'|'h')('E'|'e')('I'|'i')('G'|'g')('H'|'h')('T'|'t');
SETRADIUS: ('S'|'s')('E'|'e')('T'|'t')('R'|'r')('A'|'a')('D'|'d')('I'|'i')('U'|'u')('S'|'s');
SETPOSITION:('S'|'s')('E'|'e')('T'|'t')('P'|'p')('O'|'o')('S'|'s')('I'|'i')('T'|'t')('I'|'i')('O'|'o')('N'|'n');
ID:(('a'..'z'|'A'..'Z')+);
IN:('I'|'i')('N'|'n');
COMA:',' ;
NUEVALINEA:'\r'? '\n';
FINSENTENCIA:';';
EXPRESIONNUMERICA 
                 : PARENTHESISAP  EXPRESIONNUMERICA   PATRENTESISCE | EXPRESSION  MUL EXPRESSION | EXPRESSION  MUL EXPRESIONNUMERICA | EXPRESSION  DIV EXPRESSION | EXPRESSION  DIV EXPRESIONNUMERICA | EXPRESSION  ADD EXPRESSION | EXPRESSION  ADD EXPRESIONNUMERICA | EXPRESSION  SUB EXPRESSION | EXPRESSION  SUB EXPRESIONNUMERICA | EXPRESSION;
EXPRESSION:('0'..'9')+;
PARENTHESISAP: '(' WHITESPACE;
PATRENTESISCE: ')' WHITESPACE;
 MUL : '*' WHITESPACE ;
 DIV : '/' WHITESPACE;
 ADD : '+' WHITESPACE;
 SUB : '-' WHITESPACE;
 WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;                 
