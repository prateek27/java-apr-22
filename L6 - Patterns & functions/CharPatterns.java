package com.prateek.javapractice.functions;

public class CharPatterns {

    public static void playWithChars(){
        char letter = 'A';
        String letterString = "A";
        char nn = 'न'; // supports unicode (bigger set of characters -> 2 bytes)
        System.out.println(nn);
        System.out.println((int)nn);
        System.out.println(letter);
        System.out.println((int)letter);
        System.out.println((char)(letter + 1)); // Typecasting Explicit
        System.out.println(letterString + 1);
    }

    /* Pattern
    AA
    ABBA
    ABCCBA
    ABCDDBCA
     */
    public static void stairPattern2x(int N){

        for(int i=1; i<=N; i++){
            // i inc letters
            char letter = 'A';
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(letter);
                letter += 1;
            }
            // i dec letters
            //correct init
            for(int cnt=1; cnt<=i; cnt++){
                letter -=1;
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void stairPattern(int N){
        for(int i=1; i<=N; i++){
            // ith Row -> i letters
            // value starts with A
            char val = 'A';
            for(int letterCnt=1; letterCnt<=i; letterCnt++){
                System.out.print(val);
                val += 1;
            }
            // newline
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stairPattern2x(5);


    }
}
