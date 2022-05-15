package com.prateek.javapractice.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayList {

    public static ArrayList<ArrayList<Integer> > takeInput(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            ArrayList<ArrayList<Integer> > arrList = new ArrayList<>(n);

            for(int i=0; i<n; i++){
                int cols = sc.nextInt();
                arrList.add(new ArrayList<>());
                for(int j=0; j< cols; j++){
                    int no = sc.nextInt();
                    arrList.get(i).add(no);
                }
            }
            // arrList.get(0).add(258);
            return arrList;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > arrList = takeInput();
        /* ArrayList<ArrayList<Integer> > arrList = new ArrayList<>();

        // insert the first row (1d arraylist)
        ArrayList<Integer> row0 = new ArrayList<>();
        row0.add(1);
        row0.add(2);
        row0.add(3);

        System.out.println(row0);
         ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(5,6,7,8));
        System.out.println(row1);

        // how to add rows to 2d array list
        arrList.add(row0);
        arrList.add(row1);

        arrList.get(0).add(8);
        arrList.get(1).set(1,16);
        arrList.add(new ArrayList<>(Arrays.asList(10,20,30)));
        System.out.println(arrList);
        */
        //go to every element and print
        for(int row=0; row<arrList.size(); row++){
            // ith row
            for(int j=0; j < arrList.get(row).size(); j++){
                System.out.print(arrList.get(row).get(j) + " ");
            }
            System.out.println();
        }

    }
}
