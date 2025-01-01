
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author fedem
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {

        TabellaDati tabellina;
        tabellina = new TabellaDati();
        tabellina.show();

        // Visualizzazione del programma a schermo intero
        tabellina.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // GraphicsDevice device = graphics.getDefaultScreenDevice();
        // device.setFullScreenWindow(tabellina);
        // ALTERNATIVA COMMENTATA

        // TODO code application logic here
    }

}
