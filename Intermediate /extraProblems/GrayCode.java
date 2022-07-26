package com.prateek.javapractice.extraProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {
    public static void main(String[] args) {

        int A = 3; //no of bits in the code

        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);

        for(int i=2; i<=A; i++){
            //iterate on prev list
            for(int j= result.size() -1; j>=0; j--){
                result.add(result.get(j) + (1<<(i-1)));
            }
        }
        System.out.println(result);
    }
}
