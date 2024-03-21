package com.example.bibliotecabackend.enitity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "books", schema = "public", catalog = "")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Long idBook;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    @Column
    private String type;

    @Column(name = "publication_year")
    private Date publicationYear;

    @Column(name = "image_url")
    private String imageUrl;

    public Book() {
    }

    public Book(Long idBook, String title, Author author, String type, Date publicationYear, String imageUrl) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.type = type;
        this.publicationYear = publicationYear;
        this.imageUrl = imageUrl;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
