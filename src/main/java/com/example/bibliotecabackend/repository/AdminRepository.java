package com.example.bibliotecabackend.repository;

import com.example.bibliotecabackend.enitity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}

