package ControlFlow.LoopsPracticeQuestion;

import java.util.Scanner;

public class PrimeNumberPractice {
    public static void main(String[] args) {
        int num ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int j = 2; j <= num; j++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {

                if (j % i == 0) {
                    count++;
                }

            }

            if (count == 2) {
                System.out.println(j);
            }
        }

    }
}
