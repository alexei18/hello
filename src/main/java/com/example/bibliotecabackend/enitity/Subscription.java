package com.example.bibliotecabackend.enitity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "subscription")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subscription")
    private Long id;

    @Column(name = "id_user")
    private Long userId;

    @Column(name = "subscription_date")
    private LocalDate subscriptionDate;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "expired")
    private int expired;

    public Subscription() {
    }

    public Subscription(Long id, Long userId, LocalDate subscriptionDate, LocalDate expirationDate, int expired) {
        this.id = id;
        this.userId = userId;
        this.subscriptionDate = subscriptionDate;
        this.expirationDate = expirationDate;
        this.expired = expired;
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

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDate subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getExpired() {
        return expired;
    }

    public void setExpired(int expired) {
        this.expired = expired;
    }
}

