package com.simpleproject.booksAPI.model;

// This file describes the details of a single book
public class Book {
    private int bookId;
    private String title;
    private String author;
    private float price;

    //Default constructor
    public Book(){
    }

    //Parameterized constructor to initialize book properties
    public Book(int bookId, String title, String author, float price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Getter and setter methods for all fields

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
