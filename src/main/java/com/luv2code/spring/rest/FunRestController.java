package com.luv2code.spring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeanInfo(){
        return "Coach : "+ coachName + " Team Name : "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Updated version automated";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is yout lucky day";
    }

}