package Methods.MethodPracticeQuestions;

public class BarkingDog {

    public static void main(String[] args) {
        boolean barking = true;
        int hourOfDay = 9;

        boolean wakeUp = shouldWakeUp(barking, hourOfDay);

        System.out.println("Should we wake up ?"+wakeUp);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        else if(barking && (hourOfDay< 8 || hourOfDay == 23))
            return true;
        else
            return false;

    }
}
