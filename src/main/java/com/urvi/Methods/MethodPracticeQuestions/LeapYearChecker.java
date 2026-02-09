package com.urvi.Methods.MethodPracticeQuestions;

public class LeapYearChecker {

    public static void main(String[] args) {

        System.out.println("Program to check leap year");
        leapYearChecker(2000);
    }

    public static void leapYearChecker(int year) {

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

}
