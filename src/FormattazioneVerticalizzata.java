
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class FormattazioneVerticalizzata implements TableCellRenderer {

    // Costruttore della classe
    public FormattazioneVerticalizzata() {
        // Non � necessario aggiungere nulla nel costruttore per questo caso
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Crea un JLabel per il rendering della cella
        JLabel label = new JLabel();

        // Imposta il testo della cella
        label.setText(value == null ? "" : value.toString());

        // Imposta lo sfondo della cella in base alla selezione
        label.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
        label.setOpaque(true); // Imposta il JLabel come opaco per mostrare il colore di sfondo

        // Allineamento orizzontale centrato
        label.setHorizontalAlignment(JLabel.CENTER);

        // Allineamento verticale centrato
        label.setVerticalAlignment(JLabel.CENTER);

        // Se il testo contiene tag HTML (ad esempio <br> per le righe multiple), lo formatta
        if (label.getText().contains("<br>")) {
            label.setText("<html>" + label.getText().replaceAll("\n", "<br>") + "</html>");
        }

        // Restituisce il JLabel come componente da rendere nella cella
        return label;
    }
}
