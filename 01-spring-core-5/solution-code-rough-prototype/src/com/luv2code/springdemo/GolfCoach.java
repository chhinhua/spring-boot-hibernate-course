package com.luv2code.springdemo;

/**
 * @author Chhin_Hua - 09/02
 **/

public class GolfCoach implements Coach{
    private final FortuneService fortuneService;

    public GolfCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your putting skills for 2 hours today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
