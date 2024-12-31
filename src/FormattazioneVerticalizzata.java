
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fedem
 */
public class FormattazioneVerticalizzata implements TableCellRenderer {

    public FormattazioneVerticalizzata() {
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setText(value == null ? "" : value.toString());
        label.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        if (label.getText().contains("<br>")) {
            label.setText("<html>" + label.getText().replaceAll("\n", "<br>") + "</html>");
        }
        return label;
    }
}
