package com.sabitalizade.services;

import com.sabitalizade.models.Book;
import com.sabitalizade.models.LibraryItem;

public class BookServiceImpl implements BookService {
    @Override
    public void displayDetailedInformation(LibraryItem item) {
        System.out.println("DVD Information");
        System.out.println("Id: " + book.getId());
        System.out.println("Title: " + book.getTitle());
    }
}
