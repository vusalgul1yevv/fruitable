package com.example.fruitables.controllers.dashboard;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
//@RequestMapping("/dashboard")
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "/dashboard/index.html";
    }
}
