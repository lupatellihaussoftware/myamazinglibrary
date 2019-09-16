package it.lupatellihaus.myamazinglibrary.repository;


import it.lupatellihaus.myamazinglibrary.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

    Optional<Author> findByLastName(String lastName);


}
