package com.example.bibliotecabackend.enitity;

import javax.persistence.*;

@Entity
@Table(name = "author", schema = "biblioteca_project", catalog = "")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_author")
    private Long id_author;

    @Column
    private String first_name;
    @Column
    private String last_name;

    public Author() {
    }

    public Author(Long id_author, String first_name, String last_name) {
        this.id_author = id_author;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Long getId_author() {
        return id_author;
    }

    public void setId_author(Long id_author) {
        this.id_author = id_author;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
