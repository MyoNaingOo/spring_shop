package com.mno.shop.service;

import com.mno.shop.entity.User;
import com.mno.shop.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepo userRepo;

    public void addNewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
    }

    public User userfind(String name){
      return   userRepo.findByName(name).orElseThrow(
              () -> new UsernameNotFoundException("username not fonded")
      );
    }

    public List<User> getUsers(){
      return   userRepo.findAll();
    }

    public Optional<User> getUser(Long id){
        return userRepo.findById(id);
    }


    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

    public void updateUser(User user){
        userRepo.save(user);
    }
}
