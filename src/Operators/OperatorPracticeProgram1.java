package Operators;

public class OperatorPracticeProgram1 {

    //The register number,name and marks for three subjects are given.
    // Write a program to find the average of the three marks and print it out along with register number and name.

    public static void main(String[] args) {
        int regNo = 4567;
        String Name = "Urvi Thakkar";
        int maths=34;
        int science=45;
        int english=67;

        float average= (maths+science+english)/3f;

        System.out.println("Register Number: " + regNo);
        System.out.println("Name: " + Name);
        System.out.println("Average Marks: " + average);

    }

}
