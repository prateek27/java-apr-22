package com.prateek.javapractice.loops;

public class PrintNumbers {
    public static void main(String[] args) {
        // print numbers from 10 to 1
        // 10,9,8,7,6,5,4,3,2,1
           int i = 10;
           while(i >= 1){
               System.out.println(i);
               i = i - 1;
           }
        System.out.println("Out of the loop " +i);
         // Another Way
        i = 0;
        while(i<10){
            System.out.println(10-i);
            i = i + 1;
        }

    }
}
