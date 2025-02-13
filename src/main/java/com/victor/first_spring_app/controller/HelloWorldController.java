package com.victor.first_spring_app.controller;

import com.victor.first_spring_app.domain.User;
import com.victor.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")


public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/get")
    public String helloWorld(){
        return helloWorldService.helloWorld("Victor");
    }
    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){

        return "Seu Nome: " + body.name + " Seu Email: "+ body.email;
    }

}
