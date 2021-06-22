/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class CheckBoxRenderer implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        JCheckBox check = new JCheckBox();
        check.setSelected(((Boolean)value));
        check.setOpaque(true);
        check.setHorizontalAlignment(SwingConstants.CENTER);
        if (isSelected)
            check.setBackground(Color.GREEN);
        else
            check.setBackground(Renderer.color);
        panel.add(check, java.awt.BorderLayout.CENTER);
        panel.setBorder(new LineBorder(Color.BLACK, 1, false));
        
        return panel;
    }
    
}
