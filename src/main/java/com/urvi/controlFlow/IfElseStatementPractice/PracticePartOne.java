package com.urvi.controlFlow.IfElseStatementPractice;

public class PracticePartOne {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

}
