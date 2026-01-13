package MethodOverloadingPractoceQuestions;

import javax.management.MBeanAttributeInfo;

public class CentimeterToInches {

    public static void main(String[] args) {
        int inches = 12;
        int feet = 5;

        double centimeters1 = convertToCentimeter(inches);
        System.out.println(inches + " inches is equal to " + centimeters1 + " centimeters.");

        double centimeters2 = convertToCentimeter(inches, feet);
        System.out.println(feet + " feet and " + inches + " inches is equal to " + centimeters2 + " centimeters.");
    }

    public static double convertToCentimeter(int inches){

        return (double) inches * 2.54;

    }

    public static double convertToCentimeter(int inches, int feet){

        int totalInches = (feet*12) + inches;


        return convertToCentimeter(totalInches);
    }
}
