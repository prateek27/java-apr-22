package com.prateek.javapractice.Strings;

public class FindUtil {


    public static void main(String[] args) {
        String paragraph = "we are learning about java programming. java is a powerful lang, java java java ....";
        String word = "java";
        int occ = paragraph.indexOf("java");
        while(occ!=-1){
            System.out.println(occ);
            occ = paragraph.indexOf("java",occ+1);
        }
    }
}
