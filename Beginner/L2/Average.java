package com.prateek.javapractice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b  = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        float avg = (float)(a+b+c+d+e)/5;

        System.out.println(String.format("%.3f",avg)); //upto 2 places
        System.out.printf("%.3f",avg);
    }
}
