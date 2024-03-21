package com.example.bibliotecabackend.repository;

import com.example.bibliotecabackend.enitity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
