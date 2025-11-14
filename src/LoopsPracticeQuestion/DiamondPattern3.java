package LoopsPracticeQuestion;

/*
 *
 **
 ***
 ****
 *****
 ******
 *****
 ****
 ***
 **
 *
 */



public class DiamondPattern3 {

    public static void main(String[] args) {
        int n=6;

        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int p=0;p<n;p++){

            for (int q=5;q>p;q--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
