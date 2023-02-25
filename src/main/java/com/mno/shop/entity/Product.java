package com.mno.shop.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String post_name;

    private int price;

    private String post_text;

    private ArrayList<String> post_img;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;




    public Product(String post_name, int price, String post_text, ArrayList<String> post_img,User owner) {
        this.post_name = post_name;
        this.price = price;
        this.post_text = post_text;
        this.post_img = post_img;
        this.owner = owner;
    }

}
