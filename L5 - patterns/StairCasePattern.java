package com.prateek.javapractice.patterns;

public class StairCasePattern {
    public static void main(String[] args) {
        int N = 5;
        for(int i=1; i<=N; i++){
            // in ith row print i numbers starting from 1
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
        //1
        //22
        //333
        //4444
        //55555
        for(int i=1; i<=N; i++){
            // in ith row print i numbers starting from 1
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(cnt);
            }
            System.out.println();
        }
        //1
        //12
        //123
        //1234
        //12345

        int val=1;
        for(int i=1; i<=N; i++){
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val + " ");
                val = val+1;
            }
            System.out.println();
        }
        //obs
        // N rows
        // in ith row, there are i numbers / columns
        // the val was init 1, and it increases by 1 after every print

        //1
        //23
        //456
        //78910
        //.......


    }
}
