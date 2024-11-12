package com.example.SpringSecurityDemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/hello")
    public String greet(){
        return  "hello world";
    }
    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "Het" +request.getSession().getId();
    }
}
