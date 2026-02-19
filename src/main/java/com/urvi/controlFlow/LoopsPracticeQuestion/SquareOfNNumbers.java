package com.urvi.controlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

public class SquareOfNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a maximum number for which you want squares for: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("The square of "+i+" is: "+(i*i));
        }

    }

}
