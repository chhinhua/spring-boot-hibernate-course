package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Chhin_Hua - 12/02
 **/

@Component
public class VolleyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "For class Volley Coach";
    }

    @Override
    public String getDailyFortune() {
        return "For class Volley by fortune";
    }
}
