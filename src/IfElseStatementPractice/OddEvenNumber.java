package IfElseStatementPractice;

import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int number = SC.nextInt();

        if(number%2==0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

    }


}
