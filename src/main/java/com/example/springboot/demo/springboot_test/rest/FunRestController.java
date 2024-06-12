package com.example.springboot.demo.springboot_test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotation for controller
public class FunRestController {
    @GetMapping("/") //http get handler route
    public String sayHello(){
        return "hello wrold !!!!";
    }

    @GetMapping("/workout") //http get handler route
    public String getWorkout(){
        return "ran 5km!";
    }
}
