package Operators;

public class OperatorPracticeProgram2 {

    //A cloth shop during festival season offers a discount of 12% on all the purchases made in that shop.
    //The bill amount for the customer is given as rs. 750.5.
    //Write a program to calculate the discount amount after discount and print it out.

    public static void main(String[] args) {

        float totalBillBeforeDiscount = 750.5f;
        float discount = 12f;

        float TotalDiscountedAmount = (discount*totalBillBeforeDiscount)/100f;

        float finalBillAmount = totalBillBeforeDiscount - TotalDiscountedAmount;

        System.out.println("Total Bill Amount before discount: Rs. " + totalBillBeforeDiscount);
        System.out.println("Discount Percentage: " + discount + "%");
        System.out.println("Total Discounted Amount: Rs. " + TotalDiscountedAmount);
        System.out.println("Final Bill Amount after discount: Rs. " + finalBillAmount);
    }

}
