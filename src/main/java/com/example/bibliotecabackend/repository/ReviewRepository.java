package com.example.bibliotecabackend.repository;

import com.example.bibliotecabackend.enitity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
