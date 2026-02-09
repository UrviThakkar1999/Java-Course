package com.urvi.ControlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

//Write a program to input an integer N and print numbers from 1 to N.

public class PrintNumberOneToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();

        for(int i=1;i<=maxNum;i++){

            System.out.println(i);
        }
    }

}
