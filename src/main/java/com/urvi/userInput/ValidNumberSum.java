package com.urvi.userInput;

import java.util.Scanner;

public class ValidNumberSum {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int sum =0;
        int count =0;
        int a=0;
        int i=1;
        while (count<5){
            System.out.println("Enter number "+i+":");
            a   = sc.nextInt();

            if(a>=0&&a<=9){

                sum=sum+a;

                i++;
                count++;

            }else
                System.out.println("*****Invalid input. The number should range only from 0 to 9***** \n*****Please Enter the number again*****");


        }

        System.out.println("The sum is "+sum);
    }


}
