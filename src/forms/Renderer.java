/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class Renderer implements TableCellRenderer {

    public static final Font font = new Font("Arial", 0, 14);
    public static final Color color = new Color(204, 204, 204);
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setText(value.toString());
        label.setToolTipText(value.toString());
        label.setOpaque(true);
        label.setBorder(new LineBorder(Color.BLACK, 1, false));
        label.setFont(font);
        if (isSelected)
            label.setBackground(Color.GREEN);
        else
            label.setBackground(color);
        
        return label;
    }
    
}
