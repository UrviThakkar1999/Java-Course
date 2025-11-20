package LoopsPracticeQuestion;

import java.util.Scanner;

public class EvenNumberUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N to print even numbers up to N:");
        int N = sc.nextInt();

        System.out.println("Even numbers up to "+N+" are:");
        for(int i=1;i<=N;i++){

            if(i%2==0){
                System.out.println(i);
            }


        }


    }

}
