package it.lupatellihaus.myamazinglibrary.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.lupatellihaus.myamazinglibrary.service.BookService;
import it.lupatellihaus.myamazinglibrary.wrapper.BookWrapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public JsonNode createBookByISBN(String ISBN) {
        return null;
    }

    @Override
    public BookWrapper getBookByIsbn(String isbn) {
        RestTemplate restTemplate = new RestTemplate();
        JsonNode bookJson = restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn, JsonNode.class);
        ObjectMapper om = new ObjectMapper();
        BookWrapper wrapper = null;
        try {
            wrapper = om.treeToValue(bookJson, BookWrapper.class);
        } catch (JsonProcessingException e) {
            //TODO add log;
            e.printStackTrace();
        }
        return wrapper;
    }
}
