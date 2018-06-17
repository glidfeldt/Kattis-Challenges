#Introduktion
Molekylformler beskriver hur molekyler är uppbyggda. Molekylformler kan innehålla atomer, parenteser och siffror, exempelvis H2O (vatten) eller Ba(NO3)2 (bariumnitrat).

## Uppgift
Din uppgift är att utföra en syntaxanalys på indata. Du ska läsa in en sträng från standard input och sedan tala om ifall formeln är syntaktiskt korrekt eller inte. Om den inte är korrekt ska du även skriva ut vad som är fel och var i formeln felet uppstod. Till din hjälp får du nedan en BNF-syntax för molekylformler och en lista med atomer. Observera att alla atomer som finns med i listan räknas som korrekta. (Atomer som inte finns med i periodiska systemet räknas som inkorrekta men du behöver inte implementera alla atomer). Använd lämpligen rekursiv medåkning.

## BNF-syntax
<formel>::= <mol> \n
<mol>   ::= <group> | <group><mol>
<group> ::= <atom> |<atom><num> | (<mol>) <num>
<atom>  ::= <LETTER> | <LETTER><letter>
<LETTER>::= A | B | C | ... | Z
<letter>::= a | b | c | ... | z
<num>   ::= 2 | 3 | 4 | ...
Här är en lista på atomer:

H   He  Li  Be  B   C   N   O   F   Ne  Na  Mg  Al  Si  P   S   Cl  Ar  K   Ca  Sc  Ti  V   Cr
Mn  Fe  Co  Ni  Cu  Zn  Ga  Ge  As  Se  Br  Kr  Rb  Sr  Y   Zr  Nb  Mo  Tc  Ru  Rh  Pd  Ag  Cd
In  Sn  Sb  Te  I   Xe  Cs  Ba  La  Ce  Pr  Nd  Pm  Sm  Eu  Gd  Tb  Dy  Ho  Er  Tm  Yb  Lu  Hf
Ta  W   Re  Os  Ir  Pt  Au  Hg  Tl  Pb  Bi  Po  At  Rn  Fr  Ra  Ac  Th  Pa  U   Np  Pu  Am  Cm
Bk  Cf  Es  Fm  Md  No  Lr  Rf  Db  Sg  Bh  Hs  Mt  Ds  Rg  Cn  Fl  Lv
## Indata
Programmet ska läsa in en eller flera rader från standard input. Varje rad ska representera en (korrekt eller inkorrekt) formel. Inläsningen ska avslutas då tecknet # hittas.

## Utdata
För varje rad programmet har läst in (utom raden med #) ska programmet berätta om formeln var syntaktiskt korrekt eller vilket fel som hittades. Om formeln innehöll flera fel ska bara det första felet skrivas ut. Var noga med att skriva output på exakt samma format som visas i exemplet nedan.
