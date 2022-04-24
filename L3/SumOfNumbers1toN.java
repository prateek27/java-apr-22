package com.prateek.javapractice.loops;

import java.util.Scanner;

public class SumOfNumbers1toN {
    public static void main(String[] args) {
        // Read N, and find sum of numbers from 1 to N
        Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();

        /* Sum Logic
        int i=1;
        int sum = 0;
        while(i<=N){
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum); */

        // Sum of N numbers
        // Read a number N, followed by N inputs -> add those inputs
        // Read mulitple inputs
        int N = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<=N){
            sum = sum + sc.nextInt();
            i = i + 1;
        }
        System.out.println(sum);
    }
}
