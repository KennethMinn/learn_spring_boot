package com.example.springboot.demo.springboot_test.DI.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements  Coach{
    @Override
    public String getDailWorkout() {
        return "Practice free kick!!!";
    }
}
