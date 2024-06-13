package com.example.springboot.demo.springboot_test.DI.common;

import org.springframework.stereotype.Component;

@Component //this class is a dependency, helper obj, service, and injectable
public class CricketCoach implements Coach{

    @Override
    public String getDailWorkout() {
        return "Run 1 kilo!";
    }
}
