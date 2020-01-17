package com.tutorial.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController2 {

    @GetMapping("/hello2")
    public String sayHello(){
        return "hello World SMS!!";
    }

}