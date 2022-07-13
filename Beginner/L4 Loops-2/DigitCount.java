package com.prateek.javapractice.loops2;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digits = 0;
        int sum = 0;
        while(N>0){
            digits = digits + 1;
            sum = sum + N%10; //last  digit is given by N%10
            N = N/10; //removing the last digit from N
        }
        System.out.println(digits + " Sum " + sum);

        // For Loop
        N = sc.nextInt();
        sum = 0;
        digits=0;
        for(;N>0;N=N/10){
            digits = digits + 1;
            sum = sum + N%10;
        }
        System.out.println(digits + " Sum " + sum);
    }
}
