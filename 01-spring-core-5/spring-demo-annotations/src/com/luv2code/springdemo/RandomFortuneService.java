package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Chhin_Hua - 12/02
 **/

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private final String[] data = {
            "Beware of the wolf in sleep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = myRandom.nextInt(data.length);
        return data[index];

    }
}
