package com.mno.shop.controller;

import com.mno.shop.entity.Postor;
import com.mno.shop.entity.User;
import com.mno.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;





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
       return userService.getUsers();
    }

    @GetMapping("user/{id}")
    public Optional<User> getUser(@PathVariable ("id") Long id){
        return userService.getUser(id);
    }

//    @PostMapping("oo")
//    public Postor Start(@RequestBody Postor postor){
//       return customService.start(postor);
//    }


}
