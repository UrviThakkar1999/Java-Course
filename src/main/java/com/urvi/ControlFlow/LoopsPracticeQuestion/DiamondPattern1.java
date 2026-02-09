package com.urvi.ControlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

/*
*
**
***
****
*****
 */
public class DiamondPattern1 {

    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static class MultiplicationTable {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to print its multiplication table: ");
            int number = sc.nextInt();

            System.out.println("Table of "+number +"is: ");
            for (int i=1;i<=10;i++){


                System.out.println(number + " * "+i+" = "+(number*i));
            }
        }


    }

    public static class SumOfNNaturalNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a natural number:");
            int NaturalNumber = sc.nextInt();
            int sum=0;

            for(int i=1;i<=NaturalNumber;i++){
                sum=sum+i;
            }

            System.out.println("The sum of first "+NaturalNumber+" natural number is: "+sum);

        }

    }
}
