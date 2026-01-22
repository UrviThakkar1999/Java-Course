package Methods.MethodPracticeQuestions;

public class EvenNumber {
    public static void main(String[] args) {

        int number = 17;
        boolean result = new EvenNumber().IsEven(number);

        if (result)
            System.out.println(number + " is Even ");
        else
            System.out.println(number + " is Odd ");


    }

    public boolean IsEven(int Number) {

        if (Number % 2 == 0)
            return true;
        else
            return false;

    }

}
