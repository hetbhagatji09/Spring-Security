package com.example.SpringSecurityDemo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Entity(name ="users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    //hibernate is genarting id for you by generatedvalue annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
}
