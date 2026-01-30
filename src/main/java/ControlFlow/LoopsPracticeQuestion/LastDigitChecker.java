package ControlFlow.LoopsPracticeQuestion;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12,42,37));
    }
public static boolean hasSameLastDigit(int num1, int num2, int num3) {

    int a = 0, b = 0, c = 0;

    if (isValid(num1) && isValid(num2) && isValid(num3)) {

        while (num1 > 0) {

            a = num1 % 10;
            num1 = num1 / 10;

            while (num2 > 0) {

                b = num2 % 10;
                num2 = num2 / 10;

                while (num3 > 0) {

                    c = num3 % 10;
                    num3 = num3 / 10;

                    if (a == b || a == c || b == c) {

                        return true;
                    } else {
                        return false;
                    }

                }

            }


        }


    }
        return false;
    }


    public  static boolean isValid(int num){
        if(num >= 10 && num <= 1000)
            return true;

        return false;


    }


}

