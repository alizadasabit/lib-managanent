package com.sabitalizade.services;

import com.sabitalizade.models.LibraryItem;

public class LibraryServiceImpl implements ILibraryService, BookService {


    @Override
    public void displayDetailedInformation(LibraryItem item) {
        System.out.println("Id: " + item.getId() + " Title: " + item.getTitle() + " returned");
    }

    @Override
    public void displayItem(LibraryItem item) {
        System.out.println("Id: " + item.getId() + " Title: " + item.getTitle() + " displayed");
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println("Id: " + item.getId() + " Title: " + item.getTitle() + " borrowed");
    }

    @Override
    public void returnItem(LibraryItem item) {

    }
}
