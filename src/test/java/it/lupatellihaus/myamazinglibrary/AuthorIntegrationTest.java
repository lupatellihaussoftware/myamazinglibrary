package it.lupatellihaus.myamazinglibrary;

import it.lupatellihaus.myamazinglibrary.domain.Author;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorIntegrationTest {
     @Test
    public void givenAnnotatedAuthor_thenHasGettersAndSetters(){
         Author author = new Author();
         author.setFirstName("Test");
         assertEquals(author.getFirstName(), "Test");

     }

     @Getter
     @Setter
     class Author {
         private String firstName;
     }
}
