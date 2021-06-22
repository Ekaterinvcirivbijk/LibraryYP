/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms.book;

import entities.Book;
import entities.enums.Genre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nalbandyan
 */
public class BookTableModel extends AbstractTableModel {

    private List<Book> listBooks = new ArrayList();
     
    Class classes[] = new Class[]{
    Object.class,
    String.class,
    String.class,
    Genre.class,
    Double.class,
    Double.class,
    Boolean.class
  };

    private String[] headers = new String[] { "", "Название", "Автор", "Жанр", "Залог", "Прокат", "Взята" };

    public BookTableModel(List<Book> list)
    {
        listBooks = list;
    }
    
    public List<Book> getList()
    {
        return listBooks;
    }
    
    public void setList(List<Book> list)
    {
        listBooks = list;
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
        return listBooks.size();
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
        Book book = listBooks.get(row);
        switch (column)
        {
            case 0: return book;
            case 1: return book.getName();
            case 2: return book.getAuthor();
            case 3: return book.getGenre();
            case 4: return book.getDeposit();
            case 5: return book.getRentaOneDay();
            case 6: return book.isTaken();
        }
        return null;
    }

}
