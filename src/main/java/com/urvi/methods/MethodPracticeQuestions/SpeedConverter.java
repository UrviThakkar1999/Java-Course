package com.urvi.methods.MethodPracticeQuestions;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(25.42);
    }

    public static long toMilesPerHour( double kilometersPerHour){

        if (kilometersPerHour < 0 )
            return -1;
        else {
            long milesPerHour = (long) Math.round(kilometersPerHour / 1.609);
            return milesPerHour;

        }

    }
    public static void printConversion( double kilometersPerHour){


        if (kilometersPerHour < 0 )
            System.out.println("Invalid Value");
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }
    }

    }

