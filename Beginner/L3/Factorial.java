package com.prateek.javapractice.loops;

public class Factorial {
    public static void main(String[] args) {
        int N = 5;
        // Factorial 5 = 120
        // 1 X 2 X 3 .... N
        int i = 1;
        int ans = 1;
        while(i<=N){
            ans = ans * i;
            i = i + 1;
        }
        System.out.println(ans);
    }
    // q1. Read a number N, find sum of all numbers from 1 to N
    // q2. Read a Number N, followed by N numbers input find sum of all numbers read.


}
