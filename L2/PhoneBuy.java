package com.prateek.javapractice;

import java.util.Scanner;

public class PhoneBuy {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int budget = sc.nextInt();
        boolean isSaleActive = sc.nextBoolean();

        if(budget >= price && isSaleActive){
            System.out.println("lets buy the phone");
        }
        else{
            System.out.println("wait for sometime");
        }
    }
}
