package it.lupatellihaus.myamazinglibrary.service;

import it.lupatellihaus.myamazinglibrary.domain.Author;

public interface AuthorService {

    Author createAuthor(Author requestData);

    Iterable<Author> findAuthors();

    Author findAuthorByLastName(String lastName) throws Exception;

}
