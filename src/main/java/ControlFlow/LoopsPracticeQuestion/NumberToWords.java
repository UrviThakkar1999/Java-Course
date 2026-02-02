package ControlFlow.LoopsPracticeQuestion;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(0);
        numberToWords(234);
        numberToWords(1010);
        numberToWords(-12);
        numberToWords(1000);
    }

    public static void numberToWords(int number) {
        int a = 0;
        int numberLength = String.valueOf(number).length();
        int reverseNumber = reverse(number);
        int reversedNumberLength = getDigitCount(reverseNumber);
        //System.out.println("reverse number "+reverseNumber);
        //System.out.println("Number length ="+numberLength);
        //System.out.println("Reversed number length ="+reversedNumberLength);



        if(reverseNumber>0){

            if (numberLength == reversedNumberLength) {


                //System.out.println("number="+number);
                while(reverseNumber > 0){

                    a = reverseNumber % 10;
                    reverseNumber = reverseNumber / 10;

                    switch (a) {

                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                        default:
                            System.out.println("Invalid Value");
                            break;
                    }

                }

                //System.out.println("Invalid Value");
            } else {




                while (reverseNumber > 0) {

                    a = reverseNumber % 10;
                    reverseNumber = reverseNumber / 10;

                    switch (a) {

                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                        default:
                            System.out.println("Invalid Value");
                            break;
                    }

                }

                for (int i = 0; i < numberLength -reversedNumberLength; i++) {

                    // reverseNumber=reverseNumber*10;
                    System.out.println("Zero");

                }
            }

        }else if(reverseNumber==0){
            System.out.println("Zero");
        }else{

            System.out.println("Invalid Value");
        }



    }


    public static int reverse(int number) {

        //System.out.println("number=" + number);

        int reversedNumber = 0;
        int a = 0;


        if (number >= 0) {

            while (number > 0) {

                a = number % 10;
                number = number / 10;

                reversedNumber = reversedNumber * 10 + a;


            }

            //System.out.println("Reversed Number="+reversedNumber);
            return reversedNumber;
        }else if (number < 0){

            number =Math.abs(number);


            while (number > 0) {

                a = number % 10;
                number = number / 10;

                reversedNumber = reversedNumber * 10 + a;


            }

            //System.out.println("Reversed Number="+reversedNumber);
            return (reversedNumber*-1);
        }
        return number;
    }


    public static int getDigitCount(int number) {
        int digitCount = 0;

        if(number ==0) return 1;

        if (number > 0) {
             do{


                number = number / 10;
                digitCount++;

            }while (number > 0);
            //System.out.println("Digit count"+digitCount);
            return digitCount;
        }
        return -1;
    }


}
