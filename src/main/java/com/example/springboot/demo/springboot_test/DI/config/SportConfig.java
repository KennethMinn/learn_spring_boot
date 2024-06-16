package com.example.springboot.demo.springboot_test.DI.config;

import com.example.springboot.demo.springboot_test.DI.common.Coach;
import com.example.springboot.demo.springboot_test.DI.common.LethweiCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // to config the bean
public class SportConfig {
    //now third-party LethweiCoach class is injectable like other components
    //we can give custom beanId -> @Bean("customLethweiCoach") - @Qualifier("customLethweiCoach")
    @Bean // beanId defaults to the method name - @Qualifier("lethweiCoach")
    public Coach lethweiCoach (){
        return new LethweiCoach();
    }
}
