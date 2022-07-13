package com.prateek.javapractice.Arrays;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {
        // Hardcoded Array
        int[] marks = {10,20,30,40,50};

        System.out.println(marks);
        System.out.println(marks.length);
        System.out.println(marks[0]);
        // You can't extend the array
        // Once array is created, the size can't be changed.

        // update
        marks[2] = 17;

        // Traverse the array-1 (For Loop) - start and end index, more control over the  range
        for(int i=0; i < marks.length; i++){
            if(i==marks.length-1){
                System.out.print(marks[i]);
            }
            else {
                System.out.print(marks[i] + ",");
            }
        }

        System.out.println();
        // Traverse the array-2 (for each loop) helpful when you want cover entire array
        for(int m : marks){
            System.out.print(m + ",");
        }

        System.out.println();

        // Traverse the array-3
        System.out.println(Arrays.toString(marks));
        System.out.println(marks.length);


    }
}
