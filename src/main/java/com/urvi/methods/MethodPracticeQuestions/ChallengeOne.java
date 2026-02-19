package com.urvi.methods.MethodPracticeQuestions;

import java.util.Scanner;

public class ChallengeOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String name = sc.nextLine();
        System.out.print("Enter player score: ");
        int score = sc.nextInt();

        int position = CalculateHighScorePosition(score);
        HighScorePosition(name, position);

    }

    public static int CalculateHighScorePosition(int PlayerScore){

        int position = 4;
        if(PlayerScore >=1000)
            position = 1;
        else if(PlayerScore >=500 )
            position = 2;
        else if(PlayerScore >=100 )
            position = 3;


            return position;
    }

    public static void HighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

}
