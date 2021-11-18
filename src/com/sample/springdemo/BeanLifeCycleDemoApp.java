package com.sample.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load the spring configuration files
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve beans from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getFortune());

        // close the context
        context.close();
    }
}
