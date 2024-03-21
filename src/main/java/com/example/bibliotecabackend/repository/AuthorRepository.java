package com.example.bibliotecabackend.repository;

import com.example.bibliotecabackend.enitity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
