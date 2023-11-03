package com.spring.springrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//represental state tranfer
public class DummyController {
    @GetMapping("/hi")
    public static String sayHi(){
        System.out.println("hi");
        return "hi";
    }
}
