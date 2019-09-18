package it.lupatellihaus.myamazinglibrary.service;

import com.fasterxml.jackson.databind.JsonNode;
import it.lupatellihaus.myamazinglibrary.wrapper.BookWrapper;

public interface BookService {

    JsonNode createBookByISBN(String ISBN);

    BookWrapper getBookByIsbn(String isbn);
}
