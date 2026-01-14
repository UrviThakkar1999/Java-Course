package MethodOverloadingPractoceQuestions;

public class DurationConversion {

    public static void main(String[] args) {
        System.out.println(getDurationString(3665));
        System.out.println(getDurationString(45,65));
    }

    public static String getDurationString(int seconds){

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        int minutesInHours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return  minutesInHours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int seconds,int minutes){


        int remainingSeconds = seconds % 60;
        int minutesInHours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return  minutesInHours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

}
