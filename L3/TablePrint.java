package com.prateek.javapractice.loops;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        // table of 4 -> 4,8,12,16.......(upto first N terms)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // printing values of multiples of 4 less than
        int i = 4;
        while(i<=n){
            System.out.println(i);
            i = i + 4;
        }
        // School Method
        System.out.println("Table of 4");
        i = 1;
        while(i<=n){
            System.out.println(i*4);
            i = i + 1;
        }


    }
}
