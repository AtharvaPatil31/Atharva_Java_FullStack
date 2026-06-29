package com.atharva.Pojo;

public class Buch {

    private int isbn;
    private String title;
    private String author;
    private double price;

    public Buch() {
    }

    public Buch(int isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Buch [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    // Getters
    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}