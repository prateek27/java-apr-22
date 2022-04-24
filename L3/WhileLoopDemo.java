package com.prateek.javapractice.loops;

public class WhileLoopDemo {
    public static void main(String[] args) {
        // Going to Gym - 5 times (0-4 or 1-5 or 101-105...)
        int i = 1;
        while(i<=5){
            System.out.println("Going to Gym" + i);
            // increment i
            i = i + 1;
        }
        System.out.println("Out of the gym " +i);
    }
}
