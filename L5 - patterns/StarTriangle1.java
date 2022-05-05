package com.prateek.javapractice.patterns;

public class StarTriangle1 {
    public static void main(String[] args) {
        int N = 5;
        for(int row=1; row<=N; row=row+1){
            // row no of stars in the given row
            for(int stars=1; stars<=row; stars++){
                    System.out.print("* ");
            }
            System.out.println();
        }
        // No of stars in given row => (N-row+1)
        for(int row=1; row<=N; row=row+1){
            // row no of stars in the given row
            for(int stars=1; stars<=N-row+1; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
