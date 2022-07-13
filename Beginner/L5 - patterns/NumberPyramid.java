package com.prateek.javapractice.patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int N = 5;
        //Iterate over the rows
        for(int i=1; i<=N; i++){
            // Spaces
            for(int space=1; space<=N-i;space++){
                System.out.print("  ");
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
            System.out.println();
        }



    }
}
