package com.prateek.javapractice.functions2;
/*
        0 0 0 0 1 0 0 0 0
        0 0 0 2 3 2 0 0 0
        0 0 3 4 5 4 3 0 0
        0 4 5 6 7 6 5 4 0
        5 6 7 8 9 8 7 6 5
 */
public class HWProb {
    public static void main(String[] args) {
        int N = 12;
        //Iterate over the rows
        for(int i=1; i<=N; i++){
            // Zeroes
            for(int space=1; space<=N-i;space++){
                System.out.print("0 ");
            }
            // Increasing Order
            int val = i;
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val + " ");
                val = val + 1;
            }
            //dec part
            // reset the value
            val = val - 2;
            // loop i-1
            for(int cnt=1;cnt<=i-1; cnt++){
                System.out.print(val + " ");
                val = val-1;
            }
            // end of every row
            // Zeroes
            for(int space=1; space<=N-i;space++){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
