grammar Gb;

programm
    :   lausetejada
    ;

lausetejada
    :   lause (';' lause)*
    ;

lause
    :   lauadeklaratsioon
    |   objekt
    |   lisamine
    |   tyyp
    |   joonista
    ;

lauadeklaratsioon
    :   'var' Muutujanimi '=' 'laud('Arv','Arv')'
    ;

objekt
    :   'objekt' Muutujanimi '{' 'pos' '(' Arv ',' Arv ')' ';'
        'tyyp' '(' Muutujanimi ')' ';'
        '}'
    ;

tyyp
    :   'tyyp' Muutujanimi '{' 'tekst' '=' '"' .*? '"' ';'
                            ('korjatav' '=' ('True'|'False') ';')?
                            ('vigastus' '=' Arv ';')?
                            ('tugevus' '=' Arv ';')? '}'
    ;

lisamine
    :   'lisa' '(' Muutujanimi ',' Muutujanimi (',' Muutujanimi)* ')'
    ;

joonista
    :   'joonista' '('Muutujanimi')' ';'
    ;

Muutujanimi
    :   [a-zA-Z][a-zA-Z0-9_]*
    ;

Arv
    :   [1-9][0-9]*
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;

Kommentaar
    :   '/*' .*? '*/' -> skip
    ;

