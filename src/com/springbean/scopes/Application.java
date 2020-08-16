package com.springbean.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach mlCoach1 = classPathXmlApplicationContext.getBean("mlCoach", Coach.class);
        Coach mlCoach2 = classPathXmlApplicationContext.getBean("mlCoach", Coach.class);

        // Should return false if bean scope is defined
        boolean isSameObject = (mlCoach1 == mlCoach2);

        System.out.println("Is the same object?: " + isSameObject);

        System.out.println("Memory location of first coach: " + mlCoach1);
        System.out.println("Memory location of second coach: " + mlCoach2);
    }
}
