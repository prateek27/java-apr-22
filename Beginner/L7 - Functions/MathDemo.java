package com.prateek.javapractice.functions2;

import java.sql.SQLOutput;

public class MathDemo {
    public static double circleArea(int radius){
        return Math.PI * radius * radius;
    }

    public static void getRandom1To10(){
        for(int i=0; i<=5; i++){
            System.out.println((int)(Math.random()*10 + 1));
        }
    }

    public static void main(String[] args) {
        getRandom1To10();
        System.out.println(Math.PI); //constant variable
        System.out.println(Math.sqrt(100)); // function
        System.out.println(Math.sqrt(28));
        System.out.println(Math.abs(-56));
        System.out.println(Math.log10(1000));
        double ans = circleArea(5);
        System.out.println(String.format("%.3f",ans));
        System.out.println(Math.ceil(11.30));
        System.out.println(Math.round(11.30));


    }
}
