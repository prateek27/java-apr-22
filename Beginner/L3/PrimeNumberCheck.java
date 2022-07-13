package com.prateek.javapractice.loops;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print all divisors of the number
        int N = sc.nextInt();
        int i =1;
        int count = 0;
        while(i<=N){
            if(N%i==0){
                System.out.println(i);
                count = count + 1;
            }
            i = i + 1;
        }
        // Print count
        System.out.println("Count of Divisors " + count);
        // Prime Number?
        if(count==2){
            System.out.println(N + " is prime");
        }
        else{
            System.out.println(N + "is not prime");
        }
        // Q1. Find sum of divisors of the number.
        // Q2. Take input A & B, print all primes in the range A to B.
    }
}
