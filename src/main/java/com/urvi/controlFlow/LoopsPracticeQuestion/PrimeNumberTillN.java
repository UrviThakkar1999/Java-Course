package com.urvi.controlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

public class PrimeNumberTillN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        System.out.println(n);
        for (int i = n;i>=1;i--){

            if(n%i!=0){
                count++;
            }

        }
        System.out.println(count);
        if(count==n-2){
            System.out.println(n+" is a prime number.");
        } else {
            System.out.println(n+" is not a prime number.");
        }

    }

}
