package com.prateek.javapractice.Strings;

import java.util.Scanner;

public class LargestStringChallenge {
    public static void main(String[] args) {
        // Question - Read N, followed by N lines, print out the largest line based upon length
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Hack : to consume the extra enter we have the beginning

        int len = 0;
        int largest = 0;
        String largestLine = "";

        for(int i=0; i<N; i++){
            String line = sc.nextLine();
            len = line.length();
            if(len > largest){
                largest = len;
                largestLine = line;
            }
            System.out.println(line);
        }

        System.out.println("Largest is " + largestLine);


    }
}
