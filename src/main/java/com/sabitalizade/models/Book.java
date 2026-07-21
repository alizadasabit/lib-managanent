package com.sabitalizade.models;

public class Book extends LibraryItem {
    private String author;
    private int pageCount;

    public Book(int id, String title, String author, int pageCount) {
        super(id, title);
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetailedInformation() {
        System.out.println("Book Information");
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}
