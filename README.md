# CorsaCavalli

Questo progetto Java simula una corsa tra cavalli utilizzando i thread.  
Ogni cavallo ha un nome e una lentezza (in millisecondi), e corre per un numero di giri scelto dall'utente.  
Uno dei cavalli viene scelto casualmente e "azzoppato" durante la gara (il suo thread viene interrotto).

## Come eseguire

1. Apri il progetto in IntelliJ IDEA.
2. Assicurati che i file `Main.java` e `CorsaCavalli.java` si trovino nello stesso package.
3. Esegui il file `Main.java`.

## Funzionamento

1. Il programma chiede:
    - quanti giri vuoi fare,
    - la lentezza di ciascun cavallo,
    - e il nome del cavallo.
2. Puoi aggiungere più cavalli rispondendo "1" alla domanda *Vuoi aggiungere un nuovo cavallo?*.
3. Alla fine, tutti i cavalli partono insieme.
4. Uno dei cavalli viene scelto a caso e interrotto durante la corsa.


