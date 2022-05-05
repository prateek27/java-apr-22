package com.prateek.javapractice.patterns;

public class StarPyramid {
    public static void main(String[] args) {
        int N = 4;

        for(int i=1; i<=N; i++){
            //Print Spaces
            for(int spaces=1; spaces<=N-i; spaces++){
                System.out.print("  ");
            }
            // Print Stars
            for(int stars=1; stars<=2*i - 1; stars++){
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }

        //Another way
        int star_cnt = 1;
        for(int i=1; i<=N; i++){
            //Print Spaces
            for(int spaces=1; spaces<=N-i; spaces++){
                System.out.print("  ");
            }
            // Print Stars (stars in given row will be 2 more than prev row)
            for(int star=1; star <= star_cnt; star++){
                System.out.print("* ");
            }
            // go to next row
            star_cnt = 2 + star_cnt;
            System.out.println();
        }
    }
}
