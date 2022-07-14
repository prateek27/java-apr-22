package com.prateek.javapractice.recursion;

public class RecursionBasics {

    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }

        int ans = n * factorial(n-1);
        return ans;
    }

    static void inc(int n){
        // base case
        if(n==0){
            return;
        }

        // Rec
        inc(n-1);

        // work
        System.out.println(n);

    }

    static void dec(int n){

        //Base Case
        if(n==0){
            return;
        }

        //Work
        System.out.println(n);

        //Rec
        dec(n-1);
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }

    static int multiply(int a,int b){
        if(b==0){
            return 0;
        }
        return a + multiply(a,b-1);
    }

    public static void main(String[] args) {
        // System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(multiply(5,7));
    }
}
