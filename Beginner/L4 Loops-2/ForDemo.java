package com.prateek.javapractice.loops2;

public class ForDemo {
    public static void main(String[] args) {
        int N = 5;
        int steps = 0;
        // Regular loop
        for(steps=0; steps<N; steps++){
           // System.out.println("Walking a step" + steps);
        }
        // Regular loop
        int calories;
        for(steps=0,calories=0; steps<N && calories<15; steps=steps+1, calories=calories+5){
            System.out.println("Walking a step" + steps);
            // calories=calories+5;
        }
        System.out.println("Out of the Loop" + steps + "Calories" + calories);

        // Optional stuff
        steps=0;
        for(   ;  ; ){
            if(steps==3){
                break; // go out of the loop
            }
            System.out.println("Walking a step" + steps);
            //update
            steps=steps + 1;
        }
        System.out.println("Out of the Loop" + steps);
    }
}
