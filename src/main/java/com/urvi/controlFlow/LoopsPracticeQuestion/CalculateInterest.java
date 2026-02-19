package com.urvi.controlFlow.LoopsPracticeQuestion;

public class CalculateInterest {

    public static void main(String[] args) {

        for (double i=2.5;i<=10.0;i+=0.5){

            double interest = calculateInterest(10000,i);
            System.out.println("The interest on 10000 at rate "+i+"% is: "+interest);

        }


    }

    public static double calculateInterest(double amount, double interestRate){

            return (amount*interestRate)/100;

    }

}
