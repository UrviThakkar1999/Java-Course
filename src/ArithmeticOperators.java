

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 2;
        int b= 1;
        int c= 3;
        int add = a + b;
        int sub = c - b;
        int mul = a * c;
        int div = c / a;
        int mod = c % a;

       // int result = b++ + a++ + ++c + ++b + ++b + a++ + ++c + c++ + b++ + ++a;
        int result1 = --b;// + a-- + --c + --b + --b + a-- + --c + c-- + b-- + --a;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

//        System.out.println("value of result = "+ result);
//        System.out.println("value of A = "+ a);
//        System.out.println("value of b = "+ b);
//        System.out.println("value of c = "+ c);

        System.out.println("value of result1 = "+ result1);
        System.out.println("value of A = "+ a);
        System.out.println("value of b = "+ b);
        System.out.println("value of c = "+ c);
    }
}
