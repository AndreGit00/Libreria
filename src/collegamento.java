
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fedem
 */
// Definizione della classe collegamento.
public class collegamento {

    private final String Driver = "org.sqlite.JDBC";

    public Statement ottieniConnessione() throws SQLException, ClassNotFoundException {
        
        /** Caricamento del driver. Va inizializzato all'interno del metodo,
        utilizzando il richiamo al metodo in cui si è dichiarato. */
        Class.forName(Driver);
  
   // Calcolo del percorso relativo.
        String percorsoBase = System.getProperty("user.dir");
        String percorsoCompleto = percorsoBase + "/test/VittorioDATI.db";

        String url = "jdbc:sqlite:" + percorsoCompleto;

        Connection con = DriverManager.getConnection(url);
        return con.createStatement();
    }
}