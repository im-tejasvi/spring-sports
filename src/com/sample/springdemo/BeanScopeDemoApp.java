package com.sample.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration files
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if beans points to same memory address
        boolean isSameRef = (theCoach == alphaCoach);
        System.out.println("theCoach and alphaCoach pointing to same memory address: " + isSameRef);
        System.out.println("theCoach memory address: " + theCoach);
        System.out.println("alphaCoach memory address: " + alphaCoach);

        // close the context
        context.close();
    }
}
