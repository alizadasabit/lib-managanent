package com.sabitalizade;

import com.sabitalizade.models.Book;
import com.sabitalizade.models.DVD;
import com.sabitalizade.models.Journal;
import com.sabitalizade.services.BookServiceImpl;
import com.sabitalizade.services.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(1, "Java Programming", "John Smith", 450);
        Journal journal = new Journal(2, "Science Today", "Nature");
        DVD dvd = new DVD(3, "Inception", 148, "Christopher Nolan");

        LibraryServiceImpl service = new LibraryServiceImpl();
        BookServiceImpl bookService = new BookServiceImpl()

        service.borrowItem(book);
        service.returnItem(book);
        service.displayItem(book);
        service.displayDetailedInformation(book);
        bookService.displayDetailedInformation(book);

        System.out.println();

        service.borrowItem(journal);
        service.returnItem(journal);
        service.displayItem(journal);
        service.displayDetailedInformation(journal);


        System.out.println();

        service.borrowItem(dvd);
        service.returnItem(dvd);
        service.displayItem(dvd);
        service.displayDetailedInformation(dvd);

    }

}