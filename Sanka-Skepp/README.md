# Sänka skepp
Sänka skepp är ett spel som spelas mellan två spelare, som försöker sänka varandras skepp genom att gissa vilka av rutor på motståndarens spelplan som innehåller skepp. Så här kan spelplanen se ut (de grå rektanglarna markerar skeppen).

Vi ska nu lösa följande variant av spelet: Givet en spelplan, räkna hur många skepp spelplanen innehåller. Ett skepp är en rektangel som är 1 ruta hög och n rutor bred (där n är minst 2 och max bredden på spelplanen), eller 1 ruta bred och n rutor bred (där n är minst 2 och max höjden på spelplanen). Skepp kan inte ligga intill varandra, inte ens hörn i hörn, utan det måste alltid finnas fritt vatten (tomma rutor) emellan.

## Indata
Indata består av först två heltal r och k, som anger respektive antal rader och antal kolumner på spelplanen. Du kan förutsätta att r och k ligger mellan 2 och 10000. Sedan följer r st rader med k tecken var. Varje tecken är antingen en punkt ’.’, som markerar fritt vatten (tom ruta), eller ett ’O’ som markerar en del av ett skepp. Du kan förutsätta att alla skepp är ritade enligt reglerna ovan (dvs har rätt proportioner och ligger inte intill varandra).

## Utdata
Utdata ska bestå av ett enda heltal, som anger hur många skepp det finns på spelplanen.
