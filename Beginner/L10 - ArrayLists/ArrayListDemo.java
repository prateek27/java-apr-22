package com.prateek.javapractice.arrayLists;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);

        // Addition
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1,24); //Insert at particular index
        arr.add(0);
        System.out.println(arr.size());

        // arr.remove(1); // index 1
        Integer obj = 24;

        if(arr.contains(obj)){ //linear search
            System.out.println(obj + "found");
        }

        System.out.println(arr);
        arr.remove(obj); // remove 24 as data
        System.out.println(arr);
        // Update
        // arr.set(1,24); //index and new value

        // Remove


        // Read arr[i]
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));


        // Delete


        // Reserve Additional Capacity by using this function
        arr.ensureCapacity(100);

        // Print-2
        for(int i=0; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }
        // Print-1
        System.out.println(arr);
        // Print-2


    }
}
