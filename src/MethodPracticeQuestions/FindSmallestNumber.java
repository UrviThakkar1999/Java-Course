package MethodPracticeQuestions;

public class FindSmallestNumber {

    public static void main(String[] args) {

        double firstNumber = 14.5;
        double secondNumber = 12.7;
        double thirdNumber = 30.9;

        FindSmallestNumber fs = new FindSmallestNumber();
        double SmallestNumber = fs.FindSmallestNumber(firstNumber,secondNumber,thirdNumber);

        System.out.println("The Smallest Number is: "+SmallestNumber);
    }
    public double FindSmallestNumber(double firstNumber, double secondNumber, double thirdNumber){

        if (firstNumber <= secondNumber && firstNumber <= thirdNumber){
            return firstNumber;
        }else if (secondNumber <= firstNumber && secondNumber <= thirdNumber){
            return secondNumber;
        } else {
            return thirdNumber;
        }


    }


}
