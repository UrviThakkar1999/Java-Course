package ControlFlow.LoopsPracticeQuestion;

public class SumOfFirstAndLastDigit {


    public static void main(String[] args) {
        sumFirstAndLastDigit(10);
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int  firstDigit=0;
        int lastDigit=0;
        int length = String.valueOf(number).length();
        System.out.println("length"+length);
        if (number > 0){

            lastDigit = number % 10;

            while (number > 0){

                firstDigit   = number %10;

              number = number /10;
            }

            System.out.println("Sum ="+(firstDigit+lastDigit));
            return sum;


        }

        return -1;
    }


}
