package com.prateek.javapractice.hashing;

import java.util.HashSet;

public class SubarrayWithZeroSum {

    static boolean hasZeroSum(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        int cumSum = arr[0];
        hs.add(cumSum);

        for(int i=1; i<= arr.length-1; i++){
            cumSum += arr[i];
            if(hs.contains(cumSum)||cumSum==0){
                return true;
            }
            hs.add(cumSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,9,-11,2,-10,6,5};
        System.out.println(hasZeroSum(arr));
    }
}
