
package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Appeal {

    private Reader reader;
    private Book book;
    private GregorianCalendar dateGiven;
    private GregorianCalendar dateToReturn;
    
    private boolean returned;
    
    public static DateFormat f = new SimpleDateFormat("dd.MM.yyyy");
    
    public Appeal()
    {
        this.returned = false;
    }
    
    public Appeal(Reader reader, Book book, GregorianCalendar dateGiven, GregorianCalendar dateToReturn)
    {
        this.reader = reader;
        this.book = book;
        this.dateGiven = dateGiven;
        this.dateToReturn = dateToReturn;
        
        this.book.setTaken(true);
        
        this.returned = false;
    }
    
    public String toString()
    {
        return "ОБРАЩЕНИЕ\n" +
                "-------------\n" +
                "Читатель: " + reader + "\n" +
                  "Книга: " + book + "\n" +
                  "Дата выдачи: " + f.format(dateGiven.getTime()) + "\n" +
                  "Дата возврата: " + f.format(dateToReturn.getTime()) + "\n";
    } 
    
    public double getProfit()
    {
        if (returned)
        { 
            long millisOneDay = 1000*3600*24;
            long howManyDays = (dateToReturn.getTimeInMillis() - dateGiven.getTimeInMillis()) / millisOneDay;
            return howManyDays*book.getRentaOneDay();
        }
        else
            return book.getDeposit();
    }
    public Reader getReader() {
        return reader;
    }
    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public GregorianCalendar getDateGiven() {
        return dateGiven;
    }
    public void setDateGiven(GregorianCalendar dateGiven) {
        this.dateGiven = dateGiven;
    }
    public GregorianCalendar getDateToReturn() {
        return dateToReturn;
    }
    public void setDateToReturn(GregorianCalendar dateToReturn) {
        this.dateToReturn = dateToReturn;
    }
    
    public boolean isReturned() {
        return returned;
    }
    public void setReturned(boolean returned) {
        this.returned = returned;
        if (this.returned)
            this.book.setTaken(false);
    }
    
}