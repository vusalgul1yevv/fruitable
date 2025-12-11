//package com.example.fruitables.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//public class SecurityConfig {
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http){
//        http.csrf(c -> c.disable())
//                .authorizeHttpRequests(authorize ->
//                        authorize.requestMatchers("/dashboard/**").authenticated()
//                        authorize.anyRequest().permitAll());
//        return http.build();
//    }

//
