package com.prateek.javapractice.functions;

public class YoutubeMock {

    // SignIn
    public static boolean signIn(String username){

        if(username.equals("prateek27")){
            return true;
        }
        else{
            return false;
        }
    }
    // Upload video
    public static boolean uploadVideo(String videoName,String userName){
        boolean signInSuccess = signIn(userName);
        if(signInSuccess){
            System.out.println("Uploading Video ...");
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        boolean success = uploadVideo("Maths","prateek27");
        if(success){
            System.out.println("Video Uploaded Succesfully");
        }
        else{
            System.out.println("Something went wrong!");
        }
    }
}
