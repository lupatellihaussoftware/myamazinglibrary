package it.lupatellihaus.myamazinglibrary.service;

import it.lupatellihaus.myamazinglibrary.domain.Author;
import it.lupatellihaus.myamazinglibrary.domain.BookReview;

public interface BookReviewService {

    Iterable<BookReview> findBookReviewsByIsbnBook(String ibsn);

    BookReview createBookReviewByIsbn(BookReview requestData, String isbn) throws Exception;

}
