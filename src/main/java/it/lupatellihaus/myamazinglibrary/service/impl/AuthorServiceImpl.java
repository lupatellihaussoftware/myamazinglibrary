package it.lupatellihaus.myamazinglibrary.service.impl;

import it.lupatellihaus.myamazinglibrary.domain.Author;
import it.lupatellihaus.myamazinglibrary.repository.AuthorRepository;
import it.lupatellihaus.myamazinglibrary.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author createAuthor(Author requestData) {
        Author author = new Author();
        author.setFirstName(requestData.getFirstName());
        author.setLastName(requestData.getLastName());
        author = authorRepository.save(author);
        return author;
    }

    @Override
    public Iterable<Author> findAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findAuthorByLastName(String lastName) throws Exception {
        Optional<Author> oAuthor = authorRepository.findByLastName(lastName);
        if (oAuthor.isPresent()) return oAuthor.get();
        else throw new Exception();
    }
}
