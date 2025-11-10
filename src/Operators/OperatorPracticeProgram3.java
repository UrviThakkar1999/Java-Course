package Operators;

public class OperatorPracticeProgram3 {

    //A bank gives 6.5% per annum compound interest on deposits made in that bank.
    //Write a program to calculate the total amount that a person will receive after the end of 4 years for a deposit of Rs. 5000.

    public static void main(String[] args) {
        double principalAmount = 5000.0;
        double rateOfInterest = 6.5;
        int timeInYears = 4;

        double totalAmount = principalAmount * Math.pow((1 + rateOfInterest / 100), timeInYears);

        System.out.println("Principal Amount: Rs. " + principalAmount);
        System.out.println("Rate of Interest: " + rateOfInterest + "% per annum");
        System.out.println("Time Period: " + timeInYears + " years");
        System.out.printf("Total Amount after %d years: Rs. %.2f%n", timeInYears, totalAmount);
    }
}
