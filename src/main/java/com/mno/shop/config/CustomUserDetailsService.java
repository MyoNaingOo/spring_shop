package com.mno.shop.config;


import com.mno.shop.entity.User;
import com.mno.shop.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user= userRepo.findByName(username);

      return user.map(CustomUserDetails::new).orElseThrow(
                ()-> new UsernameNotFoundException("user not fount in my exception")
        );


    }
}
