/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.appeal;

import entities.Appeal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nalbandyan
 */
public class AppealTableModel extends AbstractTableModel {

    private List<Appeal> listAppeals = new ArrayList();
    private JTable tableAppeals = new JTable();
     
    Class classes[] = new Class[]{
    Object.class,
    Object.class,
    Object.class,
    String.class,
    String.class,
    Boolean.class,
    Double.class
  };

    private String[] headers = new String[] { "", "Читатель", "Книга", "Выдана", "К возврату", "Возвращена", "Доход" };

    public AppealTableModel(List<Appeal> list)
    {
        listAppeals = list;
    }
    
    public List<Appeal> getList()
    {
        return listAppeals;
    }
    
    public void setList(List<Appeal> list)
    {
        listAppeals = list;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    public String getColumnName(int i)
    {
        return headers[i];
    }

    @Override
    public int getRowCount()
    {
        return listAppeals.size();
    }

    @Override
    public int getColumnCount() 
    {
        return headers.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }

    @Override
    public Object getValueAt(int row, int column)
    {
        Appeal appeal = listAppeals.get(row);
        switch (column)
        {
            case 0: return appeal;
            case 1: return appeal.getReader();
            case 2: return appeal.getBook();
            case 3: return Appeal.f.format(appeal.getDateGiven().getTime());
            case 4: return Appeal.f.format(appeal.getDateToReturn().getTime());
            case 5: return appeal.isReturned();
            case 6: return appeal.getProfit();
        }
        return null;
    }

}
