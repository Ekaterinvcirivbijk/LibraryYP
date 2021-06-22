/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.reader;

import entities.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nalbandyan
 */
public class ReaderTableModel extends AbstractTableModel {

    private List<Reader> listReaders = new ArrayList();
     
    Class classes[] = new Class[]{
    Object.class,
    String.class,
    String.class,
    String.class
  };

    private String[] headers = new String[] { "", "ФИО", "Адрес", "Телефон" };

    public ReaderTableModel(List<Reader> list)
    {
        listReaders = list;
    }
    
    public List<Reader> getList()
    {
        return listReaders;
    }
    
    public void setList(List<Reader> list)
    {
        listReaders = list;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int i)
    {
        return headers[i];
    }

    @Override
    public int getRowCount()
    {
        return listReaders.size();
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
        Reader reader = listReaders.get(row);
        switch (column)
        {
            case 0: return reader;
            case 1: return reader.getFio();
            case 2: return reader.getAddress();
            case 3: return reader.getPhone();
        }
        return null;
    }

}
