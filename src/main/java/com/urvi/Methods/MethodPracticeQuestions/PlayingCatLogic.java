package com.urvi.Methods.MethodPracticeQuestions;

public class PlayingCatLogic {

     public static void main(String[] args) {

        boolean isCatPlaying = isCatPlaying(true, 30);
        System.out.println(isCatPlaying);

    }

    public static boolean isCatPlaying(boolean Summer, int temperature){


        if (Summer && (temperature >=25 && temperature<=45))
        {
            return true;
        } else if (!Summer && (temperature >=25 && temperature<=35)){

            return true;
        }


        return false;

    }
}
