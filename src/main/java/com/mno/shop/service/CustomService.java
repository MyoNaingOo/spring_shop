package com.mno.shop.service;


import com.mno.shop.entity.Product;
import com.mno.shop.entity.Role;
import com.mno.shop.entity.User;
import com.mno.shop.repo.ProductRepo;
import com.mno.shop.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomService {



    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ProductRepo productRepo;


    public Product start(){

        ArrayList<String> img = new ArrayList<>();
        img.add("img1");
        img.add("img2");


        User user1= new User("myonaingoo","200366","mmyonainngoo623@gmail.com", Role.ADMIN);

        userRepo.save(user1);

        Product product1= new Product("postname1",255,"posttext1",img, user1);
        productRepo.save(product1);



        return product1;
    }




}
