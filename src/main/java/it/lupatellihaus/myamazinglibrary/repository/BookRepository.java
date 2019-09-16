package it.lupatellihaus.myamazinglibrary.repository;


import it.lupatellihaus.myamazinglibrary.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {


}
