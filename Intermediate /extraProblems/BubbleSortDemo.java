package com.prateek.javapractice.extraProblems;

import java.util.Arrays;

public class BubbleSortDemo {

    static boolean compare(int a,int b){
        return a < b;
    }


    public static void bubbleSort(int[] arr){

        int n = arr.length;
        for(int itr=1; itr<=n-1; itr++){
            //work in each iteration
            for(int j=0; j <=n-itr-1 ; j++){
                if(compare(arr[j],arr[j+1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
            int[] arr = {1,3,0,5,3,3,7,7,6};
            bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
