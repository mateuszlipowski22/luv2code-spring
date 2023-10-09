package com.luv2code.spring.rest;

import com.luv2code.spring.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;
    private final Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach,
                          @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In constructor: "+ getClass().getSimpleName());
        this.anotherCoach = anotherCoach;
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans : coach==anotherCoach is "+ (coach==anotherCoach);
    }
}
