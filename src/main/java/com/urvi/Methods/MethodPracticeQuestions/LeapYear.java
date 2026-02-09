package com.urvi.Methods.MethodPracticeQuestions;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2000;
        boolean isLeap = isLeapYear(year);

        System.out.println(year + " is a leap year: " + isLeap);
    }

    public static boolean isLeapYear(int year) {


            if (year < 1 || year > 9999)
                return false;


            if (year % 4 == 0) {

                if (year % 100 != 0) {

                    return true;


                } else {


                    if (year % 400 == 0) {

                        return true;

                    } else
                        return false;
                }


            } else
                return false;

        }

}
