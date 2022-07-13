package com.prateek.javapractice;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last_digit = n%10;
        System.out.println(last_digit);

        if(last_digit==4){
            System.out.println("yes it is");
        }
        else{
            System.out.println("not is not");
        }

    }
}
