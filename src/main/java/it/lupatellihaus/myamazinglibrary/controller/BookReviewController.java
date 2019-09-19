package it.lupatellihaus.myamazinglibrary.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import it.lupatellihaus.myamazinglibrary.domain.Author;
import it.lupatellihaus.myamazinglibrary.domain.Book;
import it.lupatellihaus.myamazinglibrary.domain.BookReview;
import it.lupatellihaus.myamazinglibrary.repository.BookRepository;
import it.lupatellihaus.myamazinglibrary.repository.BookReviewRepository;
import it.lupatellihaus.myamazinglibrary.service.BookReviewService;
import it.lupatellihaus.myamazinglibrary.service.BookService;
import it.lupatellihaus.myamazinglibrary.wrapper.BookWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/book/review")
public class BookReviewController {

    Logger logger = LoggerFactory.getLogger(BookReviewController.class);

    @Autowired
    private BookReviewRepository bookReviewRepository;

    @Autowired
    private BookReviewService bookReviewService;

    @GetMapping(path = "/{isbn}/all")
    public @ResponseBody
    Iterable<BookReview> findBookReviewsByIsbnBook(@PathVariable String isbn) {
        return bookReviewService.findBookReviewsByIsbnBook(isbn);
    }

    @PostMapping(path = "/{isbn}") // Map ONLY POST Requests
    public @ResponseBody
    BookReview addNewBookReview(@RequestBody BookReview bookReviewInput, @PathVariable String isbn) throws Exception {
        return bookReviewService.createBookReviewByIsbn(bookReviewInput,isbn);
    }

}
