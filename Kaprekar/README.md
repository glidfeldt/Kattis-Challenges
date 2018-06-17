# Kaprekar
Den indiske matematikern Dattaraya Ramchandra Kaprekar upptäckte att talet 6174 har en märklig egenskap. Välj ett fyrsiffrigt tal där de fyra siffrorna inte alla är likadana (t.ex 8082). Om man ordnar sifforna från den största till den minsta så får vi ett nytt tal a (i detta fall 8820). Ordna sedan siffrorna från den minsta till den största så får vi ett annat tal b (i detta fall 0288). Beräkna nu differensen c=a−b=8820−0288=8532. Vi gör samma sak en gång till med det nya talet:

8532−2358=6174

Det märkliga är att denna process alltid kommer till 6174 förr eller senare. Om vi fortsätter får vi nämligen:

7641−1467=6174

Uppgiften består i att skriva ett program som givet ett ingångstal beräknar hur många iterationer det krävs innan ovanstående process kommer till 6174.

## Indata
Indata består av ett fyrsiffrigt tal.

## Utdata
Utdata ska vara antalet iterationer som krävs för att genom ovanstående process komma fram till talet 6174 från det angivna talet.
