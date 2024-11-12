package com.example.SpringSecurityDemo.Dao;

import com.example.SpringSecurityDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
