package com.prateek.javapractice.Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo {

    public static void playWithString(){
        String s = "hello"; // 1 char = 2 bytes of storage
        String greet = "नमस्ते"; //java support unicode
        System.out.println(s);
        System.out.println(greet);

        String s1 = "hi";
        String s2 = "hi";
        System.out.println(s1);
        System.out.println(s2);


        String a = new String("hi");
        String b = new String("hi");

        // Comparing Object References
        System.out.println(s1==s2);
        System.out.println(a==b);

        // Compare values of strings
        System.out.println(s1.equals(s2));
        System.out.println(a.equals(b));

        // string one is greater than other, dictionary order (comparison based upon integer value of characters)
        System.out.println("apple".compareTo("mango"));
        System.out.println("apple".compareTo("apple"));
        System.out.println("mango".compareTo("banana"));
        System.out.println("नमस्ते".compareTo("नमस्त"));

        char l1 = 'a';
        char l2 = 'm';
        System.out.println((int)l1);
        System.out.println((int)l2);
        System.out.println((int)(l1 - l2));
        System.out.println("apple".compareTo("appy"));
        System.out.println((int)'i');
        System.out.println("h".compareTo("hi"));
        System.out.println("hi".compareTo("h"));

        // Character Arrays, Mutable
        char arr[] = {'a','b','c'};
        arr[0] = 'x'; //can be modified
        System.out.println(arr);

        // String you want to create a create array out of a string
        String s3 = "abc";
        char brr[] = s3.toCharArray(); // String ---> Char Array
        brr[0] = 'x';
        System.out.println(brr);
        System.out.println(s3);
        s3 = new String(arr); // Char Array --> String
        System.out.println("New String " + s3);
        int[] arrayNum = {1,2,3};
        char[] arrayChar = {'h','i','i'};
        System.out.println("Array Int" + arrayNum);
        System.out.println("Array Char" + arrayChar);
        System.out.println(arrayChar); //special behaviour for char[] where data is printed instead of address
    }

    public static void main(String[] args) {
        char[] arr = {'h','i'};
        String s2 = arr.toString();
        String s1 = new String(arr);

        System.out.println(s1);
        System.out.println(s2);

        String numString = "123";
        char letter = '5';
        System.out.println( (int)(letter - '0'));
        System.out.println( (int)(letter) * 10);

        // Iterate on the string
        String greet = "Hello World";
        //read the ith letter
        System.out.println(greet.charAt(0));

        // Iterate on a String, and get char by char
        for(int i=0; i< "नमस्ते".length(); i++){
            System.out.print("नमस्ते".charAt(i));
        }

        // Library Functions
        // Ex-1 Convert string into upper case
        String ship = "Titanic ship is sailing";
        System.out.println(ship.toUpperCase());
        System.out.println(ship.toLowerCase());

        // Search Operation
        System.out.println(ship.contains("sailing"));
        System.out.println(ship.contains("water"));

        // Strip -> Remove Leading & trailing whitespaces
        String paragraph = "    this is paragraph . . .    ";
        System.out.println(paragraph.length());
        System.out.println(paragraph.strip());
        paragraph = paragraph.strip();
        System.out.println(paragraph.length());

        // Time To Try
        String[] filenames = {"dsc01.jpg","dsc08.jpg","mydoc.pdf","hello.exe","photo.png","explorer.exe","mypng.pdf"};

        // Filter out the files which are images
        // System.out.println("my.png.pdf".contains(".png"));
        for(int i=0; i< filenames.length; i++){
            if(filenames[i].endsWith(".png")||filenames[i].endsWith(".jpg")) {
                System.out.println(filenames[i]);
            }
        }

        // Another way -> For Each Loop
        for(String file : filenames){
            if(file.endsWith(".jpg")||file.endsWith(".png")){
                System.out.println(file);
            }
        }
        System.out.println();

        System.out.println("abcyoyoxyz".matches(".*yoyo.*"));
        // Regex Matching for validation & matching

        // Read Strings
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); //reads the first token
        String name = sc.nextLine();
        System.out.println(name);














    }
}
