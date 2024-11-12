package com.example.SpringSecurityDemo.service;

import com.example.SpringSecurityDemo.Dao.UserRepo;
import com.example.SpringSecurityDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(10);

    @Autowired
    private UserRepo userRepo;



    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
