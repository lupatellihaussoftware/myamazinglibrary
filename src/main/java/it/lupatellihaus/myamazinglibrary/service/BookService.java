package it.lupatellihaus.myamazinglibrary.service;

import com.fasterxml.jackson.databind.JsonNode;

public interface BookService {

    JsonNode createBookByISBN(String ISBN);

}
