package ControlFlow.LoopsPracticeQuestion;

public class SumOddRange {

    public static void main(String[] args) {
           int total =  sumOdd(1,10);
              System.out.println("The sum of odd numbers in the range is: "+total);
    }


        public static boolean isOdd(int number){

            if(number<0 || number%2==0){
                return false;
            }

            return true;

        }

        public static int sumOdd(int start,int end){
            int sum=0;

            if(end>0 && start>0 && end>=start){

                for (int i=start;i<=end;i++){

                    if(isOdd(i)){

                        sum=sum+i;
                    }
                }

            }else
                return -1;


            return sum;
        }



}
