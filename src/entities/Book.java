
package entities;

import entities.enums.Genre;

public class Book {
    
    private String name;
    private String author;
    private Genre genre;
    
    private double deposit;
    private double rentaOneDay;
    
    private boolean taken;
    
    public Book()
    {
        this.taken = false;
    }
    
    public Book(String name, String author, Genre genre, double deposit, double rentaOneDay)
    {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.deposit = deposit;
        this.rentaOneDay = rentaOneDay;
        this.taken = false;
    }
    
    @Override
    public String toString()
    {
        return "Название: " + name + ", автор: " + author + ", жанр: " + genre;
    }
   
    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getRentaOneDay() {
        return rentaOneDay;
    }

    public void setRentaOneDay(double rentaOneDay) {
        this.rentaOneDay = rentaOneDay;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
    
}