
package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Library {
    
    private List<Book> books;       // Список книг
    private List<Reader> readers;   // Картотека читателей
    private List<Appeal> history;   // История обращений

    public Library()
    {
        books = new ArrayList();
        readers = new ArrayList();
        history = new ArrayList();
    }
    
    public String toString()
    {
        return "Библиотека";
    }
    
    public void addBook(Book book)
    {
        books.add(book);
    }
    
    public void addReader(Reader reader)
    {
        readers.add(reader);
    }
    
    public void addAppeal(Appeal appeal)
    {
        history.add(appeal);
    }
    

    public double getProfit()
    {
        long profit = 0;
        
        Iterator<Appeal> it = history.iterator();
        while (it.hasNext())
            profit += it.next().getProfit();
        
        return profit;
    }
    

    public List<Book> getBooks() {
        return books;
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }


    public List<Reader> getReaders() {
        return readers;
    }


    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }


    public List<Appeal> getHistory() {
        return history;
    }

  
    public void setHistory(List<Appeal> history) {
        this.history = history;
    }
    
}