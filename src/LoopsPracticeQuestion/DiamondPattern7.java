package LoopsPracticeQuestion;


/*
      *
     ***
    *****
   *******
  *********
 ***********
  *********
   *******
    *****
     ***
      *
 */

public class DiamondPattern7 {

    public static void main(String[] args) {
        int n=6;

       for (int i=0;i<n;i++){
            for(int j=5;j>i;j--){

                System.out.print(" ");

            }
            for(int j=0;j<=i;j++){

                System.out.print("*");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

     /*   for(int p=0;p<n;p++){


            System.out.println();
        }*/



       for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){

                System.out.print(" ");

            }

            for(int j=5;j>i;j--){

                System.out.print("*");

            }
           for (int q=4;q>i;q--){
               System.out.print("*");
           }

            System.out.println();
        }

    }

}
