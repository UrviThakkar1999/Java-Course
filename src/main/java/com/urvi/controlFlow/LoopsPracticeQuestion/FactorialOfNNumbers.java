package com.urvi.controlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

public class FactorialOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();

//        for(int i=1;i<=number;i++){
//            int factorial=1;
//            for(int j=1;j<=i;j++){
//                factorial=factorial*j;
//            }
//            System.out.println("The factorial of "+i+" is: "+factorial);
//        }
            int factorial =1;
        for (int i=number ;i>=1;i--){

            factorial=factorial*i;

        }

        System.out.println("The factorial of "+number+" is: "+factorial);
    }

}
