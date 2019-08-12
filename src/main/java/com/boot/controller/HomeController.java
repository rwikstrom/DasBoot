package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Spring MVC controller
@RestController
public class HomeController {

    // Request mapping for our route URL.
    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
