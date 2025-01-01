import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fedem
 */
public class FormattazioneVerticalizzata {
    public static void ApplicaAllineamento(JTable table) {
        DefaultTableCellRenderer ResaGrafica = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setVerticalAlignment(SwingConstants.TOP);
                setBorder(BorderFactory.createEmptyBorder(20, 1, 20, 1));
                if (column == 0) {
                    setHorizontalAlignment(SwingConstants.RIGHT);
                } else {
                    setHorizontalAlignment(SwingConstants.LEFT);
                }
                return c;
            }
        };
        
        for (int i = 0; i < table.getColumnCount(); i++) {
                table.getColumnModel().getColumn(i).setCellRenderer(ResaGrafica);
        }
    }
}
