package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Chhin_Hua - 12/02
 **/

@Component
public class DemoFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Demo practice";
    }
}
