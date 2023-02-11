package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Chhin_Hua - 12/02
 **/


@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
