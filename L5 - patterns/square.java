package com.prateek.javapractice.patterns;

public class square {
    public static void main(String[] args) {
        int N = 6;
        int M = 5; // user input

        for(int row=1; row<=N; row++){
            // System.out.println("Row " + row);
            // M stars in every row
            for(int stars=1; stars<=M; stars++){
                if(stars==M){
                    //removes space after the last star
                    System.out.print("*");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
