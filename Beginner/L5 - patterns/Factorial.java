package com.prateek.javapractice.patterns;

public class Factorial {
    public static int fact(int n){
        // base case
        if(n==0){
            return 1;
        }
        //recursive case
        int ans = n * fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
