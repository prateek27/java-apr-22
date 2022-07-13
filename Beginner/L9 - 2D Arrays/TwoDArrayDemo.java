package com.prateek.javapractice.twoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {

    public static void print2DArray(int[][] arr){

        int rows = arr.length;
        for(int i=0; i < rows; i++){
            // how to print the ith row
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // create a function that return a 2d array of ints after reading user input
    public static int[][] createUserInput2DArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++){
            // every col of of ith row
            for(int j=0; j < cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[][] createUserInput2DArrayWithVarCols(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for(int i=0; i<rows; i++){
            System.out.println("Tell me cols in row " +i);
            int cols_ith_row = sc.nextInt();
            arr[i] = new int[cols_ith_row];
            // read the data as the 1d array object for each row has just been created
            for(int j=0; j<cols_ith_row; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Hard-coded array (2D Jagged Array -> cols are different for every row)
       // int[][] arr =  createUserInput2DArray(); // {{1,2,3,4,5},{4,5,6},{7,8,9,10}};
        int[][] arr = createUserInput2DArrayWithVarCols();
        for(int[] obj : arr){
            System.out.println(Arrays.toString(obj));
        }
        // print2DArray(arr);

        /*
        System.out.println(arr); // ?
        System.out.println(arr[0]); // ?
        System.out.println(arr[0][0]); // ?
        int rows = arr.length;
        System.out.println(rows);
        System.out.println(arr[0].length); //5
        System.out.println(arr[1].length); //3 */
    }
}
