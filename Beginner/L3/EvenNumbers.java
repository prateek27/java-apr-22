package com.prateek.javapractice.loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Read a N, and print all even numbers in the range 1 ... N
        // N = 10, 2,4,6,8,10
        int i = 1;
        while (i<=N){
            if(i%2==0){
                System.out.println(i);
            }
            i = i + 1;
        }
        System.out.println("out of the loop");
        // Another Way
        i = 2;
        while(i<=N){
            System.out.println("i " +i);
            i = i + 2;
        }
        System.out.println("Out of the loop");
    }
}
