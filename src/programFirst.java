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
    }


}
