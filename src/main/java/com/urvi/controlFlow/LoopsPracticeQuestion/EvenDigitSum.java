package com.urvi.controlFlow.LoopsPracticeQuestion;

public class EvenDigitSum {

    public static void main(String[] args) {
        int sum = getEvenDigitSum(2222);
        System.out.println("The sum of even digits is: "+sum);
    }


    public static int getEvenDigitSum(int number){

        int length = String.valueOf(number).length();

        int sum = 0;

        if (number >= 0){

            for(int i=0;i<=length;i++){

                int a = number%10;


                if(a%2==0){

                    sum+=a;

                }

                number = number/10;

            }

            //System.out.println("Summ + "+sum);
            return sum;
        }

        return -1;


    }
}
