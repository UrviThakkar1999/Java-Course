package LoopsPracticeQuestion;

import java.util.Scanner;

public class AllFactorsOfANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();

        System.out.println("Factors of "+num+" are: ");

        for (int i=num;i>=1;i--){

            if(num%i==0){
                System.out.print(" "+i+" ");
            }

        }



    }



}
