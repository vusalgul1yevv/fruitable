package com.example.fruitables.controllers;

import com.example.fruitables.entities.User;
import com.example.fruitables.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

//    @PostMapping("/save")
//    public User saveUser(@RequestBody User user){
//        return userService.saveUser(user);
//    }
}
