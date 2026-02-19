package com.urvi.controlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int terms = sc.nextInt();
        int a=0,b=1;

        System.out.print("Fibonacci Series: "+a +" "+b+" ");

        for(int i=1;i<=terms-2;i++){

        int next = a+b;
        System.out.print(next+" ");
        a=b;
        b=next;
        }

        }

    }

