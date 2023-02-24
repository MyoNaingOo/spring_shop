package com.mno.shop.entity;

import jakarta.persistence.*;

@Entity
public class Post_or {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;


}
