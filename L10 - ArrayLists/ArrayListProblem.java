package com.prateek.javapractice.arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {

    // Read N, followed by N inputs, if the number is even store N*N else store N*N*N in an arraylist
    // create a arraylist
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(N);
        for(int i=0; i<N; i++){
            Integer x = sc.nextInt();
            arr.add(x);
        }
        System.out.println(arr);

    }
}
