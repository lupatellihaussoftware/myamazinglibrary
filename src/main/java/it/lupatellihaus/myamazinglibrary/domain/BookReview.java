package it.lupatellihaus.myamazinglibrary.domain;

import javax.persistence.*;

@Entity
@Table(name = "book_review")
public class BookReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private StarRatingEnum rating;
    private String user;
    private String review;

    public enum StarRatingEnum {
        POOR, NOT_BAD, STANDARD, GOOD, AWESONE;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StarRatingEnum getRating() {
        return rating;
    }

    public void setRating(StarRatingEnum rating) {
        this.rating = rating;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
