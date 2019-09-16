package it.lupatellihaus.myamazinglibrary.controller;

import com.fasterxml.jackson.databind.JsonNode;
import it.lupatellihaus.myamazinglibrary.domain.Book;
import it.lupatellihaus.myamazinglibrary.repository.BookRepository;
import it.lupatellihaus.myamazinglibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(path = "/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping(path = "/isbn/{isbn}")
    public @ResponseBody
    JsonNode getBookByIsbn(@PathVariable String isbn) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn, JsonNode.class);
    }

    @PostMapping(path = "/isbn/{isbn}")
    public @ResponseBody
    JsonNode createBookByIsbn(@PathVariable String isbn) {

        return bookService.createBookByISBN(isbn);

//		RestTemplate restTemplate = new RestTemplate();
//		return restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=isbn:"+isbn, JsonNode.class);
    }

}
