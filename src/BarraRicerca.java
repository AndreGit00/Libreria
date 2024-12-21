/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fedem
 */
// Definizione della classe collegamento.
public class BarraRicerca {

    static void Cerca(String ParametroDiRicerca, DefaultTableModel Modello) {
        try {
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            ResultSet RisultatiCercati = st.executeQuery("SELECT * FROM VittorioDati"
                    + "WHERE [Chiave_primaria} LIKE '%" + ParametroDiRicerca + "%'"
                    + "OR Argomento LIKE '%" + ParametroDiRicerca + "%'"
                    + "OR Categoria LIKE '%" + ParametroDiRicerca + "%'"
                    + "OR Autore LIKE '%" + ParametroDiRicerca + "%'"
                    + "OR Titolo LIKE '%" + ParametroDiRicerca + "%'"
                    + "OR Editore LIKE '%" + ParametroDiRicerca + "%'"
                    + "OR Luogo LIKE '%" + ParametroDiRicerca + "%'"
                    + "OR Anno LIKE '%" + ParametroDiRicerca + "%'");
            RisultatiCercati.last();
            ResultSetMetaData DatiOttenuti = RisultatiCercati.getMetaData();
            int riga = RisultatiCercati.getRow();
            int colonna = DatiOttenuti.getColumnCount();
            RisultatiCercati.beforeFirst();
            String RigaDati[][] = new String[riga][colonna];
            int progressivo = 0;
            while (RisultatiCercati.next()) {
                for (int i = 0; i < colonna; i++) {
                    RigaDati[progressivo][i] = RisultatiCercati.getString(i + 1);
                }

                progressivo++;
            }

            String[] NomeColonna = {"[Chiave_primaria]", "Argomento", "Categoria", "Autore", "Titolo", "Editore", "Luogo", "Anno"};
  
            Modello.setDataVector(RigaDati, NomeColonna);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Statement Inserisci(Number ChiavePrimaria, String Argomento, String Categoria,
            String Autore, String Titolo, String Editore, String Luogo, String Anno) {
        try {
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            boolean inserisci = st.execute("INSERT INTO VittorioDati VALUES " + ChiavePrimaria + ", "
                    + Argomento + ", " + Categoria + ", " + Autore + ", " + Titolo + ", "
                    + Editore + ", " + Luogo + ", " + Anno);
            if (!inserisci) {
                JOptionPane.showMessageDialog(null, "Inserito");
            } else {
                JOptionPane.showMessageDialog(null, "Errore! Riprova.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Statement Modifica(Number ChiavePrimaria, String Argomento, String Categoria,
            String Autore, String Titolo, String Editore, String Luogo, String Anno) {
        try {
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            boolean modifica = st.execute("UPDATE VittorioDati "
                    + "SET Argomento = 2, "
                    + "Categoria = 3, "
                    + "Autore = 4, "
                    + "Titolo = 5, "
                    + "Editore = 6, "
                    + "Luogo = 7, "
                    + "Anno = 8 WHERE [Chiave_primaria] = " + ChiavePrimaria);
            if (!modifica) {
                JOptionPane.showMessageDialog(null, "Modificato");
            } else {
                JOptionPane.showMessageDialog(null, "Errore! Riprova.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    ;
    
    public Statement Elimina(Number ChiavePrimaria) {
        try {
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            int elimina = JOptionPane.showConfirmDialog(null, "Sei sicuro di cancellare la riga selezionata?");
            if (elimina == 0) {
                if (!st.execute("DELETE FROM VittorioDati WHERE [Chiave_primaria] = " + ChiavePrimaria)) {
                    JOptionPane.showMessageDialog(null, "Errore di eliminazione");
                } else {
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    ;
    
}
