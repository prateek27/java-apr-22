package com.prateek.javapractice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a Scanner (object)
        Scanner sc = new Scanner(System.in);

        // Use it
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}


