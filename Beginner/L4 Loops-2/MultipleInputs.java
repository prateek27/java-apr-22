package com.prateek.javapractice.loops2;

import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            // Read a Number
            int number = sc.nextInt();
            // Print its sum
            int sum = 0;
            for( ; number>0; number=number/10){
                sum = sum + number%10;
            }
            System.out.println(sum);
        }
    }
}
