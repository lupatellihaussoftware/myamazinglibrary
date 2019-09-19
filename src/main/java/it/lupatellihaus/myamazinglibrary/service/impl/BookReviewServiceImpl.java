package it.lupatellihaus.myamazinglibrary.service.impl;

import it.lupatellihaus.myamazinglibrary.domain.Book;
import it.lupatellihaus.myamazinglibrary.domain.BookReview;
import it.lupatellihaus.myamazinglibrary.repository.BookRepository;
import it.lupatellihaus.myamazinglibrary.repository.BookReviewRepository;
import it.lupatellihaus.myamazinglibrary.service.BookReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BookReviewServiceImpl implements BookReviewService {

    @Autowired
    BookReviewRepository bookReviewRepository;

    @Autowired
    BookRepository bookRepository;

    @Override
    public Iterable<BookReview> findBookReviewsByIsbnBook(String isbn) {
        return bookReviewRepository.findAllByBook_Isbn(isbn);
    }

    @Override
    public BookReview createBookReviewByIsbn(BookReview requestData, String isbn) throws Exception {
        Optional<Book> oBook = bookRepository.findOneByIsbn(isbn);

        if(!oBook.isPresent()) throw new Exception("book with isbn: " + isbn + " not found");
        BookReview bookReview = new BookReview();
        bookReview.setRating(requestData.getRating());
        bookReview.setUser(requestData.getUser());
        bookReview.setReview(requestData.getReview());
        bookReview.setBook(oBook.get());

        bookReview = bookReviewRepository.save(bookReview);
        return bookReview;

    }
}
