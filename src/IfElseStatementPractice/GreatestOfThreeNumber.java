package IfElseStatementPractice;

//Input three numbers and print the greatest number.

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a= sc.nextInt();
        System.out.println("Enter the value of b:");
        int b= sc.nextInt();
        System.out.println("Enter the value of c:");
        int c= sc.nextInt();

        if(a>b){

            if(a>c){
                System.out.println("The greatest number is a: "+a);
            } else {
                System.out.println("The greatest number is c: "+c);
            }
        }else if(b>a){

            if (b>c){
                System.out.println("The greatest number is b: "+b);
            } else {
                System.out.println("The greatest number is c: "+c);
            }
        }

    }

}
