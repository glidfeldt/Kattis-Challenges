# Almanackan

Vi vill implementera en enkel almanacka som kan läsa in ett antal inbokningar, och sedan skriva ut dem i tidsordning.

## Indata
Indata inleds med ett positivt heltal n som anger antal inbokningar. Du kan förutsätta att n ligger mellan 1 och 10000. Sedan följer n inbokningar på följande format

månad dag tid beskrivning

till exempel

maj 23 13:00 Lunch med chefen

Månadena anger med de tre första bokstäverna i månadens svenska namn. Tiden anges alltid på formatet hh:mm. Du kan förutsätta att alla månader, dagar och tidpunkter är korrekta (detta behöver alltså inte kollas). Vidare kan du förutsätta att beskrivningarna inte innehåller några svenska tecken (åäöÅÄÖ). OBS! Det kan vara ett godtyckligt antal mellanslag mellan månad och dag, mellan dag och tid, och mellan tid och beskrivning.

## Utdata
Utdata ska bestå av alla inbokningarna utskrivna i tidsordning. Mellan respektive månad, dag, tid och beskrivning ska det vara exakt 1 mellanslag.
