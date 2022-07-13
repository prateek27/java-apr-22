package com.prateek.javapractice;

import java.util.HashMap;
import java.util.HashSet;

public class HashingDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> menu = new HashMap<>();

        // Insert
        menu.put("burger",100);
        menu.put("pizza",400);
        menu.put("noodles",150);
        menu.put("pepsi",40);

        //remove
        menu.remove("burger");

        // update
        int oldPrice = menu.get("noodles");
        menu.put("noodles",oldPrice + 10);

        menu.put("burger",menu.getOrDefault("burger",70) + 20);

        // check for presence
        if(menu.containsKey("pepsi")){
            System.out.println(menu.get("pepsi"));
        }
        else{
            System.out.println("pepsi not available");
        }

        // search
        System.out.println(menu.get("burger"));

        // iterate over all key value pairs in hashmap
        for(String itemName : menu.keySet()){
            System.out.println(itemName + " - " + menu.get(itemName));
        }

        // ....Homework.... //
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        
    }
}
