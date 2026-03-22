package org.library;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void markAsBorrowed() {
        this.isAvailable = false;
    }

    public void markAsReturned() {
        this.isAvailable = true;
    }

    public void getDetails() {
        System.out.println("Book information: " +"\n"+
                            "Title: " +this.title+ "\n"+
                            "ISBN: " +this.isbn+ "\n"+
                            "Author: " +this.author+ "\n"+
                            "Available: " +this.isAvailable);
    }

}