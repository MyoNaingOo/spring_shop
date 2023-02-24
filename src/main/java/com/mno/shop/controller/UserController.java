package com.mno.shop.controller;

import com.mno.shop.entity.Product;
import com.mno.shop.entity.User;
import com.mno.shop.service.CustomService;
import com.mno.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private CustomService customService;


    @PostMapping("add")
    public void  add(@RequestBody User user){
        userService.addNewUser(user);
    }


    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable("id") Long id,@RequestBody User user){
        user.setId(id);
        userService.updateUser(user);
    }

    @GetMapping("users")
    public List<User> getusers(){
       return userService.getUser();
    }


    @GetMapping("start")
    public Product Start(){
       return customService.start();
    }


}
