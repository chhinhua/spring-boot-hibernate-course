package com.luv2code.springdemo;

/**
 * @author Chhin_Hua - 08/02
 **/

public class TrackCoach implements Coach {

    // define a private field for the dependency
    private final FortuneService fortuneService;

    // define a constructor for the dependency injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
