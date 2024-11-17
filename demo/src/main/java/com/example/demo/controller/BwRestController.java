package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BwRestController {
//    http://localhost:8080/bw_shop_add_data
    @GetMapping("/bw_shop_add_data")
    public String hello() {
        return "Hello, Heroku!";
    }
}
