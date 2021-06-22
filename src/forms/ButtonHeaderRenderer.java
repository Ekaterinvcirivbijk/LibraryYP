/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ButtonHeaderRenderer extends JButton implements TableCellRenderer {

    private static Font font = new Font("Arial", 1, 18);
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) 
    {
         setText((value == null) ? "" : value.toString());
         setFont(font);
         return this;
    }

  }