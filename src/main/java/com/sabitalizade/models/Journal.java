package com.sabitalizade.models;

public class Journal extends LibraryItem {
    private String publisher;

    public Journal(int id, String title, String publisher) {
        super(id, title);
    }

    @Override
    public void displayDetailedInformation() {
        System.out.println("Journal Information");
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
    }
}
