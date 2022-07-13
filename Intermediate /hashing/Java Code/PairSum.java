package com.prateek.javapractice.hashing;

import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {

        int[] arr = {3,5,2,7,10,8,20,6};
        HashSet<Integer> hs = new HashSet<>();

        int TS = 12;

        for(int x : arr){
            int A = x;
            int B = TS - A;
            if(hs.contains(B)){
                System.out.println(A + "," + B);
            }
            hs.add(A);
        }
    }
}
