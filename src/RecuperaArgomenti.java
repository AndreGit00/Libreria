
import java.sql.*;
import java.util.ArrayList;

public class RecuperaArgomenti {

    // Procedura per ottenere i valori della colonna 'Argomento' dalla tabella 'VittorioARGOMENTI'
    public static String[] OttieniArgomentiDaTabella() throws ClassNotFoundException {
        // ArrayList per memorizzare i valori della colonna Argomento
        ArrayList<String> argomentiList = new ArrayList<>();

        try {
            
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            String sql = "select Argomento from VittorioARGOMENTI";
            ResultSet rs = st.executeQuery(sql);

            // Aggiungi i valori alla lista
            while (rs.next()) {
                String argomento = rs.getString("Argomento");
                argomentiList.add(argomento); // Aggiungi ogni valore alla lista
            }

            // Converti la lista in un array
            String[] argomentiArray = argomentiList.toArray(new String[0]);

            // Chiudi la connessione al database
            rs.close();
            st.close();

            return argomentiArray;

        } catch (SQLException e) {
            e.printStackTrace();
            return new String[0]; // Restituisce un array vuoto in caso di errore
        }
    }
}
