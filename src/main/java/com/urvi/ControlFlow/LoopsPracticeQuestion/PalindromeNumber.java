package com.urvi.ControlFlow.LoopsPracticeQuestion;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = -121;
        System.out.println(isPalindrome(number));
    }


        public static boolean isPalindrome( int number){
            number=Math.abs(number);
            int originalNumber=number;
            System.out.println(number);
            int a = 0;
            int reverse = 0;

            while(number>0){

                a = number % 10;
                number = number / 10;
                System.out.println("reverse num"+reverse);
                reverse = (reverse*10)+a;



            }
            System.out.println("Final Reverse: "+reverse);
            System.out.println("Final Number: "+originalNumber);
                return reverse == originalNumber;


        }



}
