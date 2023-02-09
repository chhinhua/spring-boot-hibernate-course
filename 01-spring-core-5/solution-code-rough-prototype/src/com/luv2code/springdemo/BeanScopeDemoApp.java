package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chhin_Hua - 09/02
 **/

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alfaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean result = (theCoach == alfaCoach);

        // print out the result
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alfaCoach: " + alfaCoach + "\n");

        // close the context
        context.close();

    }
}
