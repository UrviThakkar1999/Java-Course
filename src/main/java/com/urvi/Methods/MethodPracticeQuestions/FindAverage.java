package com.urvi.Methods.MethodPracticeQuestions;

public class FindAverage {

    public static void main(String[] args) {

        double mathScore=45.4;
        double scienceScore=55.5;
        double englishScore=65.6;

        FindAverage fa=new FindAverage();
        double averageMarks=fa.FindAverageMarks(mathScore,scienceScore,englishScore);
        System.out.println("The com.com.urvi.Practice.Average Marks are: "+averageMarks);
    }

    public double FindAverageMarks(double mathScore,double scienceScore,double englishScore){
        double averageScore;
        averageScore = (mathScore+scienceScore+englishScore)/3;
        return averageScore;
    }
}
