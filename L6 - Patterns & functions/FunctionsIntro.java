package com.prateek.javapractice.functions;

import java.util.Scanner;

public class FunctionsIntro {

    // Hello Function
    public static void sayHello(String name){ //function definition
        System.out.println("Hello "+name);
    }
    // Function can Accept Input and they can return some output
    // Go for Shopping
    public static int goShopping(String item, int wt,int money){
        System.out.println("Buying "+wt + "kg of " +item);
        int unit_price = 25;
        int money_left = money - (unit_price*wt);
        return money_left;
    }

    // Calculate the area of the circle
    public static float getAreaOfCircle(int radius){
        return (float)Math.PI * radius * radius;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sayHello(name);
        System.out.println("Area is " + getAreaOfCircle(5));

        int moneyLeft = goShopping("Apple",5,200);
        System.out.println("Shopping Complete! Left with" + moneyLeft);
        // goShopping(5,"Apple");
        // sayHello("Soumya");
    }
}
