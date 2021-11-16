package com.sample.springdemo;

public class MainClass {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}
