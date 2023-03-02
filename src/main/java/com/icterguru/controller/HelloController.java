package com.icterguru.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcome.message}")
    private String welcomeMsg;

    @GetMapping("/")
    public String helloWorldGetMapping() {
        return welcomeMsg;
    }
    
    @PostMapping("/post")
    public void helloWorldPostMapping() {
        System.out.println ("Hi " + welcomeMsg);
    }
    
    // @Minute 4:02 Configuration setup   https://www.youtube.com/watch?v=zvR-Oif_nxg
    
}
