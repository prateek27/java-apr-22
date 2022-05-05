package com.prateek.javapractice.patterns;

import java.util.Scanner;

public class SquareHollow {
    public static void main(String[] args) {
        // N rows
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            // Row1 or RowN
            if(i==1 || i==N){
                // how many stars
                for(int stars=1; stars<=N; stars++){
                    System.out.print("* ");
                }
            }
            else{
                // otherwise middle rows
                System.out.print("* ");
                // N-2 spaces
                for(int spaces=1; spaces<=N-2; spaces++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            //next row
            System.out.println();
        }
    }
}
