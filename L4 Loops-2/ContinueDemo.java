package com.prateek.javapractice.Maths;

public class ContinueDemo {
    public static void main(String[] args) {
        int i=1;
        while(i<=30){
            if(i%7==0 || i%3==0){
                i = i + 1;
                continue;
            }

            //skip this work for multiple of 7
            System.out.println(i);
            i = i +1;
        }
    }
}
