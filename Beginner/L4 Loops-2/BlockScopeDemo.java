package com.prateek.javapractice.loops2;

public class BlockScopeDemo {
    public static void main(String[] args) {
        int x = 20;
        if(true){
            x = 10;
            System.out.println("Inside If " + x);
        }

        System.out.println("Outside If " + x);
    }
}
