package com.example.SpringSecurityDemo.service;

import com.example.SpringSecurityDemo.Dao.UserRepo;
import com.example.SpringSecurityDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;



    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
