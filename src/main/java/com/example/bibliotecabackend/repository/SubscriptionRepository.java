package com.example.bibliotecabackend.repository;

import com.example.bibliotecabackend.enitity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
