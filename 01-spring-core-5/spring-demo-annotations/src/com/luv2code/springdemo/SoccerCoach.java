package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Chhin_Hua - 14/02
 **/

public class SoccerCoach implements Coach{

    private final FortuneService fortuneService;

    @Value("${foo.email}")
    private String team;

    @Value("${foo.team}")
    private String email;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "get daily workout vs soccer coach";
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
