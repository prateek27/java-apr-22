package com.prateek.javapractice;

import java.util.Scanner;

public class Divisble {
    public static void main(String[] args) {

        // check if its divisible by 3 and its last digit is 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%3==0 && n%10==4){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println("OR");
        if(n%3==0 || n%10==4){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
