package com.sda.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHomepage(){
        System.out.println("heeey!!!!!!!!!!!!!!!");
        return "home";
    }



}
