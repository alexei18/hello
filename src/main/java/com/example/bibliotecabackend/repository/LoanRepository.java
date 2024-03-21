package com.example.bibliotecabackend.repository;

import com.example.bibliotecabackend.enitity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
