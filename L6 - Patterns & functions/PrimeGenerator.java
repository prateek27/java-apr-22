package com.prateek.javapractice.functions;

import java.util.Scanner;

public class PrimeGenerator {
    // Given a Number, check if it is Prime (boolean)
    public static boolean checkPrime(int n){
        // any number which has atleast 1 divisor btw 2...N-1 is non-prime
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        // out of the loop-> no divisors were found!!
        return true;
    }
    // Given two Numbers A & B, print all primes [A,B] (void)
    // Re-usability
    public static void printPrimes(int A,int B){
        for(int i=A; i<=B; i++){
            if(checkPrime(i)==true){
                System.out.println(i);
            }
        }
    }



    // main (void)
    public static void main(String[] args) {
        printPrimes(10,30);
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPrime(n));*/

    }



}
