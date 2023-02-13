package com.luv2code.springdemo;

/**
 * @author Chhin_Hua - 13/02
 **/

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "To day is a sad day";
    }

}
