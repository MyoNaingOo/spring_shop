package com.mno.shop.controller;


import com.mno.shop.entity.Postor;
import com.mno.shop.service.PostorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/postor")
public class PostorController {


    @Autowired
    private PostorService postorService;


    @GetMapping("ords")
    public List<Postor> getPostors(){
      return postorService.getPostors();
    }

    @GetMapping("ord/{id}")
    public Optional<Postor> getPostor(@PathVariable("id") Long id){
        return postorService.getPostor(id);
    }


    @PostMapping("{user_id}/to/{product_id}/{bulk}")
    public Postor addPostor(
            @PathVariable("user_id") Long userid,
            @PathVariable ("product_id") Long product_id,
            @PathVariable ("bulk") int bulk)
    {

     return  postorService.addPostor(userid,product_id,bulk);
    }

}
