package com.mno.shop.service;


import com.mno.shop.entity.Postor;
import com.mno.shop.entity.User;
import com.mno.shop.repo.PostorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PostorService {

    @Autowired
    private PostorRepo postorRepo;

    @Autowired
    private UserService userService;



    @Autowired
    private ProductService productService;

    public List<Postor> getPostors(){
        return postorRepo.findAll();
    }


    public Optional<Postor> getPostor(Long id){
        return postorRepo.findById(id);
    }

    public Postor addPostor(Long user_id,Long product_id,int bulk){
        Postor postor= new Postor();
        postor.setUser(userService.getUser(user_id).orElse(null));
        postor.setProduct(productService.getProduct(product_id).orElse(null));
        postor.setOrder_bulk(bulk);
        postor.setOrder_date(LocalDate.now());

       return postorRepo.save(postor);
    }


}
