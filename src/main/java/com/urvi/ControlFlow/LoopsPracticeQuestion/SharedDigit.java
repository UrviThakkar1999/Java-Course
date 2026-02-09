package com.urvi.ControlFlow.LoopsPracticeQuestion;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }


    public static boolean hasSharedDigit(int num1, int num2){
            int a=0;
            int b=0;
            int c=num2;

            if((num1>=10&&num1<=99)&&(num2>=10&&num2<=99)) {
                while (num1 > 0) {

                    a = num1 % 10;
                    num1 = num1 / 10;

                    while (c > 0) {

                        b = c % 10;
                        c = c / 10;

                        if (a == b) {

                            return true;

                        }

                    }
                    c=num2;
                }
            }


        return false;
    }
}
