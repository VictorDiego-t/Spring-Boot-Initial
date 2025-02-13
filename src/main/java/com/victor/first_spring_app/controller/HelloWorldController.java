package com.victor.first_spring_app.controller;

import com.victor.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")


public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/get")
    public String helloWorld(){
        return helloWorldService.helloWorld("Victor");
    }

}
