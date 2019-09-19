package it.lupatellihaus.myamazinglibrary.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

}