package com.prateek.javapractice.functions2;

import java.util.Scanner;

public class FactAndBinCoeff {

    public static int factorial(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static int binomialCoeff(int n,int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
    public static void pascalsTriangle(int n){

        for(int i=0; i<=n; i++){
            for(int j=0; j<=i ; j++){
                System.out.print(binomialCoeff(i,j) + " ");
            }
            System.out.println();
        }
    }
    public static void pascalsTriangleOpt(int n){

        for(int i=0; i<=n; i++){
            int current = 1;

            for(int j=1; j<=i+1 ; j++){
                System.out.print(current + " ");
                current = ((i - j + 1) * current) / j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascalsTriangle(5);
        pascalsTriangleOpt(5);
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println(factorial(no));
        System.out.println(binomialCoeff(5,2));
    }
}
