package com.prateek.javapractice.hashing;

import java.util.HashMap;

public class HashingWithSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2,4,3,8,3,9,4,9,4,10};
        int k = 4;

        HashMap<Integer,Integer> hm = new HashMap<>();
        // Do it for the first window (O(k))
        for(int i=0; i<k; i++){
            int key = arr[i];
            int value = hm.getOrDefault(key,0) +1;
            hm.put(key,value);
        }
        System.out.print(hm.size()+",");

        // do it for remaining windows
        int s = 1;
        int e = k;

        while(e<arr.length){
            //Outgoing Element
            int outgng = arr[s-1];
            hm.put(outgng, hm.get(outgng)-1);
            if(hm.get(outgng)==0){
                //remove the key value pair
                hm.remove(outgng);
            }
            // Incoming Element
            int incming = arr[e];
            hm.put(incming, hm.getOrDefault(incming,0)+1);

            // Print the window size
            System.out.print(hm.size() +",");

            //Move the window
            s = s + 1;
            e = e + 1;
        }

    }
}
