
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
    
    // attributi privati
    // driver per la connessione al database
    private final String Driver = "net.sourceforge.jtds.jdbc.Driver";
    // stringa per la connessione, specificante instanza, database e dati di accesso
    private final String StringaDiConnessione = "jdbc:jtds:sqlserver://localhost;"
                + "instance=SQLEXPRESS;"
                + "user=PROGRAMMATORI;"
                + "password=GenoveffaXXX!;"
                + "databaseName=VittorioDATI;"
                + "encrypt=true"
                + "trustServerCertificate=true;"
                + "loginTimeout=4;";
    
    /* Visualizza i dati ottenuti da un' interrogazione */
    public Statement ottieniConnessione () throws SQLException, ClassNotFoundException {
        Class.forName(Driver);
        Connection con = DriverManager.getConnection(StringaDiConnessione); 
        return con.createStatement();
    } 
}