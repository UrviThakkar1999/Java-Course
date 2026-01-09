public class programFirst {

    public static void main(String[] args) {

        int maxIntegerValue = Integer.MAX_VALUE;
        int minIntegerValue = Integer.MIN_VALUE;

        System.out.println("Maximum Integer Value: " + maxIntegerValue);
        System.out.println("Minimum Integer Value: " + minIntegerValue);

        System.out.println("Integer Overflow Example:");
        int overflowedValue = maxIntegerValue + 1;
        System.out.println("Value after overflow of maxIntegerValue : " + overflowedValue);

        System.out.println("Integer Underflow Example:");
        int underflowedValue = minIntegerValue - 1;
        System.out.println("Value after underflow of minIntegerValue: " + underflowedValue);


        byte myByteNum=120;
        short myShortNum = 12000;
        int myIntNum = 50000;

        long myLongNum = (long) (50000L + 10L * (myByteNum + myShortNum + myIntNum));
        System.out.println("value of myLong is = " + myLongNum);


        float myFloatValue =  (float) 4.25;
        System.out.println("My float value is = " + myFloatValue);


        double pound = 209.61d;
        double kilogram = pound * 0.45359237d;
        System.out.println(pound + " pounds is equal to " + kilogram + " kilograms.");

        char myQuestionmark = '?';
        char myQuestionMarkUnicode = '\u003F';
        char myQuestionMarkDecimal = 63;

        System.out.println("My question mark character: " + myQuestionmark);
        System.out.println("My question mark using Unicode: " + myQuestionMarkUnicode);
        System.out.println("My question mark using Decimal: " + myQuestionMarkDecimal);

        int dec = 10;
        dec +=  2;
        System.out.println("The value of dec is: " + dec);



        double firstValue = 20.00;
        double secondValue = 80.00;

        double result = (firstValue + secondValue) * 100.00;
        double remiander = result % 40.00;
        System.out.println("remainder = "+ remiander);

        boolean isNoRemainder = (remiander == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (isNoRemainder == false) {
            System.out.println("Got some remainder");
        }






    }


}
