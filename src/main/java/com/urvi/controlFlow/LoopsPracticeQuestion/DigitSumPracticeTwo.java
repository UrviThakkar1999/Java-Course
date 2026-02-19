package com.urvi.controlFlow.LoopsPracticeQuestion;

public class DigitSumPracticeTwo {

    public static void main(String[] args) {
        int number = -3434;
        int result = sumDigit(number);
        System.out.println("The sum of the digits in number " + number + " is: " + result);
    }



    public static int sumDigit(int number){
        int length = String.valueOf(number).length();
        int sum = 0;
        int sum1 = 0;
        if(number>=0){

            for(int i=0;i<=length;i++){

                int a = number%10;
                number = number/10;
                sum = sum+a;
            }
            return sum;
        }

        return -1;


    }
}
