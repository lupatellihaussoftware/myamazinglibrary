package it.lupatellihaus.myamazinglibrary.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import it.lupatellihaus.myamazinglibrary.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public JsonNode createBookByISBN(String ISBN) {
        return null;
    }
}
