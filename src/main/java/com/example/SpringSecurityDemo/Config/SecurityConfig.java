package com.example.SpringSecurityDemo.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    //if we want to change in configuration we have to return securityfilterchain object
    //it is our configuration
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(customizor->customizor.disable());
        //unable sign up authentication page
        http.authorizeHttpRequests(request->request.anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults())
        //make session stateless
        //every time you hit the url or make a new request it gives you enew session id
        .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));


        return http.build();

    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1= User.withDefaultPasswordEncoder().
                username("harsh").
                password("1234").
                roles("USER").
                build();
        UserDetails user2= User.withDefaultPasswordEncoder().
                username("shruti").
                password("1234").
                roles("ADMIN").
                build();
        return new InMemoryUserDetailsManager(user1);
    }
}
