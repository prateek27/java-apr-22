package com.prateek.javapractice.loops;

import java.util.Scanner;

public class PowerAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        //find a power b a = 5, b = 4
        // example 5^4 = 625
        int i = 1;
        int ans = 1;
        while(i<=B){
            ans = ans * A;
            System.out.println(ans);
            i = i + 1;
        }
        System.out.println(ans);
    }
}
