package com.luv2code.springdemo;

/**
 * @author Chhin_Hua - 08/02
 **/

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private final FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spend 20 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune service
        return fortuneService.getFortune();
    }
}
