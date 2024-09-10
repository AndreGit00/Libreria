# Libreria
Il programma consente un'immediata fruizione e ricerca della documentazione del signor Vittorio.

## Integrazione del progetto Github con NetBeans
L'ambiente di sviluppo NetBeans consente di interagire facilmente con Github per lo scaricamento e la modifica di progetti presenti. Per scaricare un progetto Github in locale, provvedere alla sua modifica e infine confermare la modifica seguire la seguente guida.

### Clonazione di repository
In primo luogo, scaricare in locale il progetto presente utilizzando il menù: TEAM --> GIT --> CLONE.
Nella prima schermata il link da cui prendere il progetto: https://github.com/AndreGit00/Libreria. Confermare le schermate successive.

### Salvataggio locale tramite COMMIT
Al termine delle modifiche, per confermarle eseguire la procedura di COMMIT tramite il seguente menù:

![COMMIT](https://github.com/user-attachments/assets/62caa1a2-025f-4681-b1d6-2f41483b54a4)

Ora le modifiche sono state salvate in locale. Prima di caricarle su Github, se è la prima volta che si effettua il caricamento, seguire i seguenti due passaggi:
1) Andare sul sito di Github, accedere al proprio profilo e andare sotto il seguente menù: Settings --> Developer settings --> Personal access tokens --> Tokens (classic) --> Generate new token (classic). Nella schermata che compare, in note scrivere "NetBeans" e selezionare tutte le voci presenti nei menù a spunta. Dare al token una scadenza infinita. Una volta generato, salvarlo in un documento poiché non risulterà più reperibile. Su NetBeans, quando compariranno schermate come la seguente, inserire come nome utente la mail e come password il token.
   
![immagine](https://github.com/user-attachments/assets/020fa116-08c3-45db-ad68-7b28770d1cac)

2) Andare, su NetBeans, nel seguente menù.

![Apri CONFIGURAZIONE](https://github.com/user-attachments/assets/cfb6125a-103c-4b6e-8657-1879ae2617cc)


Impostare, nelle due voci finali, il nome utente utilizzato su Github e la mail associata.
![immagine](https://github.com/user-attachments/assets/76a840e1-a38e-462e-b4ec-abf9cfcfc8b8)

Ora è posasibile eseguire la procedura di PUSH, per riportare in Github tutte le modifiche effettuate in locale:
![PUSH](https://github.com/user-attachments/assets/61dcea20-0133-4662-b244-9e5332f65239)

Un'altra procedura utile è quella di PULL, che consente di aggiornare la versione locale del programma, sulla base delle modifiche caricate da altri utenti su Github:
![PULL](https://github.com/user-attachments/assets/606d5086-f34b-418d-b404-83d5d9d934de)
