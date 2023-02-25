package com.mno.shop.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Postor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public int getOrder_bulk() {
        return order_bulk;
    }

    public void setOrder_bulk(int order_bulk) {
        this.order_bulk = order_bulk;
    }

    private LocalDate order_date;
    private  int order_bulk;


    public Postor() {
    }

    public Postor(User user, Product product, LocalDate order_date, int order_bulk) {
        this.user = user;
        this.product = product;
        this.order_date = order_date;
        this.order_bulk = order_bulk;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
