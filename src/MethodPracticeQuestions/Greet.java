package MethodPracticeQuestions;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome!");
    }
}
