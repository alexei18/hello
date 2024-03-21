package com.example.bibliotecabackend.repository;

import com.example.bibliotecabackend.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByEmail(String email);

}
