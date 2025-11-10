package Operators;

public class BooleanLogicalOperators {

    public static void main(String[] args) {
        boolean q = true;
        boolean w = false;

        int a= 2;
        int b= 3;
        int x=5;
        int y=7;

        System.out.println("a>b && x<y :" + (a>b && x<y)); // false
        System.out.println("a<b || x>y :" + (a<b || x>y)); // true
        System.out.println("!(a==b) :" + !(a==b)); // true
        System.out.println("a>b & x<y :" + (a>b & x<y)); // false
        System.out.println("a<b | x>y :" + (a<b | x>y)); // true
        System.out.println("!(a!=b) :" + !(a!=b)); // false

        // Logical AND
        System.out.println("x && y: " + (q && w)); // false

        // Logical OR
        System.out.println("x || y: " + (q || w)); // true

        // Logical NOT
        System.out.println("!x: " + (!q)); // false
        System.out.println("!y: " + (!w)); // true
    }

}
