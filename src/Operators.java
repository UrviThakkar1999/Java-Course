public class Operators {

    public static void main(String []args){

        //arithmetic operators

        int a=10;
        int b=5;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        System.out.println("Addition : " + addition);
        System.out.println("Subtraction : " + subtraction);

        System.out.println("Multiplication : " + multiplication);
        //modulus operator
        int modulus = a % b;
        System.out.println("Modulus : " + modulus);


        //relational operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));

        //logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

    }

}
