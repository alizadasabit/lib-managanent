package com.sabitalizade.services;

import com.sabitalizade.models.LibraryItem;

public interface ILibraryService {
    void displayItem(LibraryItem item);

    void borrowItem(LibraryItem item);

    void returnItem(LibraryItem item);

}
