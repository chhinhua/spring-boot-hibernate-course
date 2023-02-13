package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Chhin_Hua - 13/02
 **/

public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    @Value("${foo.email}")
    private String team;

    @Value("${foo.team}")
    private String email;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }
}
