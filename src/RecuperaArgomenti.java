
import java.sql.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fedem
 */
public class RecuperaArgomenti {

    public static String[] OttieniArgomentiDaTabella() throws ClassNotFoundException {
        ArrayList<String> argomentiList = new ArrayList<>();

        try {
            collegamento Connessione = new collegamento();
            Statement st = Connessione.ottieniConnessione();
            String sql = "select Argomento from VittorioARGOMENTI";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String argomento = rs.getString("Argomento");
                argomentiList.add(argomento);
            }

            String[] argomentiArray = argomentiList.toArray(new String[0]);

            rs.close();
            st.close();

            return argomentiArray;

        } catch (SQLException e) {
            e.printStackTrace();
            return new String[0];
        }
    }
}
