package com.example.SpringSecurityDemo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name ="users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private int id;
    private String username;
    private String password;
}
