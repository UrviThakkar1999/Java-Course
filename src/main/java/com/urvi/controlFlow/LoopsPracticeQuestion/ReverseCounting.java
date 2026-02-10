package com.urvi.controlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

public class ReverseCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        System.out.println("Reverse counting from " + num + " to 1:");

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
