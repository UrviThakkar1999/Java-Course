package ControlFlow.LoopsPracticeQuestion;

public class EvenNumberWhileLoop {

    public static void main(String[] args) {

        int number = 5;
        int countEven = 0;
        int countOdd = 0;

        while (number <= 20) {


            if (isEven(number)) {
                countEven++;

                if(countEven<=5) {
                    System.out.println(number + " is even.");
                }else{
                    break;
                }
            }else{
                countOdd++;

            }

            number++;
        }

        System.out.println("Total even numbers found: " + countEven);
        System.out.println("Total odd numbers found: " + countOdd);


    }



    public static boolean isEven(int number){

        return number % 2 == 0;


    }


}
