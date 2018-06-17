# Talföljden
Här är en intressant typ av talföljder: Utgå från ett positivt heltal a0. Om a0 är jämnt, beräknar vi nästa tal a1=a0/2, men om a0 är udda beräknar vi a1=a0∗3+1. Sedan beräknar vi a2 från a1 på samma sätt (dividera med 2 om a1 är jämnt, multiplicera med 3 och addera 1 om a1 är udda, osv.).

För varje startvärde a får vi nu en talföljd, som alltid verkar hamna på 1 förr eller senare. För startvärdet 3 får vi till exempel följden

3 10 5 16 8 4 2 1

och för startvärdet 4 får vi

4 2 1

Från startvärdet 3 når vi alltså talet 1 i 7 steg, medan det från startvärdet 4 enbart tar 2 steg. Vi är nu intresserade av hur många steg det tar talföljden att nå talet 1 för alla startvärden i ett visst intervall.

## Indata
Indata består av två heltal x och y som utgör den lägre respektive den högre gränsen i intervallet. Du kan förutsätta att x<y, och att x och y ligger mellan 0 och 10000.

## Utdata
Utdata ska bestå av lika många rader som det finns tal i intervallet [x,y]. Första raden ska innehålla ett tal som anger antal steg det tar att nå talet 1 från startvärdet x, andra raden ska ange antal steg från startvärdet x+1, osv., ända upp till y.
