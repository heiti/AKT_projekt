grammar Gb;

programm
    :   lausetejada
    ;

lausetejada
    :   lause ('; lause)*
    ;

lause
    :   lauadeklaratsioon
    ;

lauadeklaratsioon
    :   'var' Muutujanimi '='  