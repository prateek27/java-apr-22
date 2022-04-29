package com.prateek.javapractice.loops2;

import java.util.Scanner;

public class ReverseANo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Jugaad - We are not actually reversing the number, we are printing the digits in the reverse
        for( ; N>0; N=N/10){
            System.out.print(N%10);
        }
        N = sc.nextInt();
        // You want to reverse the actual number
        int sum = 0;
        for( ; N>0; N=N/10){
            sum = sum*10 + N%10;
        }
        System.out.println(sum);
    }
}
