package it.lupatellihaus.myamazinglibrary.repository;

import it.lupatellihaus.myamazinglibrary.domain.Book;
import it.lupatellihaus.myamazinglibrary.domain.BookReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookReviewRepository extends CrudRepository<BookReview, Integer> {

    List<BookReview> findAllByBook_Isbn(String ibsn);

}
