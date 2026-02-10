package com.urvi.controlFlow.LoopsPracticeQuestion;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 1));
    }

    public static int getGreatestCommonDivisor(int first, int second) {


        if (first >= 10 && second >= 10) {

            for (int i = first; i >= 1; i--) {

                if (first % i == 0) {

                    for (int j = second; j >= 1; j--) {

                        if (second % j == 0) {

                            if (i == j) {
                                return i;
                            }
                        }
                    }

                }

            }

        }


        return -1;
    }

}
