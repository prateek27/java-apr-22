package com.prateek.javapractice.extraProblems;

import java.util.Arrays;
import java.util.Comparator;

public class SortingDemo {

    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,5},{3,4},{0,2},{1,4}};
        //Comparator
        Arrays.sort(coordinates, (int []a, int[] b)->(a[0]*a[0] + a[1]*a[1] - (b[0]*b[0] + b[1]*b[1])));

        //Another Way
        // sort acc to x coordinates
        Arrays.sort(coordinates, Comparator.comparingInt((int[] obj)->(obj[0])));

        // sort acc to y coodinates
        Arrays.sort(coordinates, Comparator.comparingInt((int[] obj)->(obj[1])));
        //distance from 0,0
        Arrays.sort(coordinates, Comparator.comparingInt((int[] obj)->(obj[0]*obj[0] + obj[1]*obj[1])));
        System.out.println(Arrays.deepToString(coordinates));


    }
}
