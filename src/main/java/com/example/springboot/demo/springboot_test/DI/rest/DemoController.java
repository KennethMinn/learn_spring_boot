package com.example.springboot.demo.springboot_test.DI.rest;

import com.example.springboot.demo.springboot_test.DI.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;
    //define a constructor for dependency injection
    @Autowired //tells spring to inject a dependency
    public  DemoController(Coach theCoach){
        this.myCoach=theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkouot(){
        return  this.myCoach.getDailWorkout();
    }
}
