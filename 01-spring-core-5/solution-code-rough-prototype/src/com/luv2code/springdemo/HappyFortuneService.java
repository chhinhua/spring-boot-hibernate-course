package com.luv2code.springdemo;

/**
 * @author Chhin_Hua - 08/02
 **/

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "To day is your lucky day!";
    }
}
