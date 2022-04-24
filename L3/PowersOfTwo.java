package com.prateek.javapractice.loops;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // print power of 2 in the range 1 to N
        // N = 100 , output -> 1, 2, 4, 8 , 16, 32, 64
        int i = 1; //init
        while (i<=N){ // condition
            System.out.println(i);; //work
            i = i*2; //update
        }

    }
}
