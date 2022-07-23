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

    // correct but inefficient -> WHY?
    static int power(int a,int n){
        if(n==0){
            return 1;
        }
        // even
        if(n%2==0){
            return power(a,n/2)*power(a,n/2);
        }
        //odd
        return a * power(a,n/2)*power(a,n/2);
    }

    // correct and efficient
    static int fpower(int a,int n){
        if(n==0){
            return 1;
        }
        // even
        int smallAns = fpower(a,n/2);
        smallAns = smallAns*smallAns;
        if(n%2==0){
            return smallAns;
        }
        //odd
        return a * smallAns;
    }

    public static void main(String[] args) {

        System.out.println(power(5,4));
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(multiply(5,7));
    }
}
