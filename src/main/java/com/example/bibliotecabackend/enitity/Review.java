package com.example.bibliotecabackend.enitity;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_review")
    private Long id;

    @Column(name = "id_user")
    private Long userId;

    @Column(name = "id_book")
    private Long bookId;

    @Column(name = "message")
    private String message;

    @Column(name = "star")
    private int star;

    public Review() {
    }

    public Review(Long id, Long userId, Long bookId, String message, int star) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.message = message;
        this.star = star;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
