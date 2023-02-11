package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chhin_Hua - 12/02
 **/

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theCoach2 = context.getBean("volleyCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach2.getDailyWorkout());

        // close the context
        context.close();
    }
}
