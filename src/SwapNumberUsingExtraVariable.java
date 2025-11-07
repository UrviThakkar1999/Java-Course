public class SwapNumberUsingExtraVariable {

    public static void main (String []args){

        int a=12;
        int b=10;
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping : ");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);



    }

}
