package it.lupatellihaus.myamazinglibrary.repository;


import it.lupatellihaus.myamazinglibrary.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Integer> {

    Optional<Book> findOneByIsbn(String isbn);


}
