package com.example.springboot.demo.springboot_test.DI.rest;

import com.example.springboot.demo.springboot_test.DI.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;
//    define a constructor for dependency injection
    @Autowired //tells spring to inject a dependency - constructor injection
    public  DemoController(@Qualifier("lethweiCoach") Coach theCoach){
        this.myCoach=theCoach; //@Qualifier("beanId") - beanId is like a class but first character is lower case
    }

//    @Autowired //tells spring to inject a dependency - setter injection - also works with any method name just add the annotation
//    public void  setCoach(Coach theCoach){
//        this.myCoach=theCoach;
//    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkouot(){
        return  this.myCoach.getDailWorkout();
    }
}
