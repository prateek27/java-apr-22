package com.prateek.javapractice.StacksQueues;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);
        s.push(5);

        while(!s.empty()){
            System.out.println(s.top());
            s.pop();
        }
    }
}
