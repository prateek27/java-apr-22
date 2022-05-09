package com.prateek.javapractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUserInput {

    public static void print(int[] someArr,int N){
        for(int i=0; i<N; i++){
            System.out.print(someArr[i] + ",");
        }
    }

    // Searching Algorithm
    // find the location of a given element in the array, if not present return -1
    public static int search(int[] arr,int element){

        for(int i=0; i<=arr.length; i++){
            if(arr[i]==element){
                return i;
            }
        }
        // element was not found
        return -1;
    }
    // Insert an element in the middle of the array at some pos - p, assume the array is big enough
    public static void insert(int arr[],int n,int element,int pos){
        // shifting
        for(int i=n-1; i>=pos-1; i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2*N];

        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        // Read N elements, loop runs N times
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt(); //update
        }
        // System.out.println(Arrays.toString(arr));
        print(arr,N);
        System.out.println();
        insert(arr,N, 20,3);
        print(arr,N+1);
        // Searching
        //System.out.println(search(arr,14));
    }
}
