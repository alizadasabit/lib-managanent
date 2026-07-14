package com.sabitalizade;

public class LibraryService {
    public void displayItem(LibraryItem item) {
        System.out.println("Id: " + item.getId() + " Title: " + item.getTitle() + " displayed");
    }

    public void borrowItem(LibraryItem item) {
        System.out.println("Id: " + item.getId() + " Title: " + item.getTitle() + " borrowed");
    }

    public void returnItem(LibraryItem item) {
        System.out.println("Id: " + item.getId() + " Title: " + item.getTitle() + " returned");
    }

}
