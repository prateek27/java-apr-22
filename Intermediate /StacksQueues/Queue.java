package com.prateek.javapractice.StacksQueues;

public class Queue {
    int arr[];
    int front;
    int rear;
    int cs;
    int N;

    Queue(int defaultSize){
        N = defaultSize;
        arr = new int[N];
        front = 0;
    }

    boolean full(){
       return cs==N;
    }
    boolean empty(){
        return cs==0;
    }

    void push(int x){
        if(!full()){
            arr[rear] = x;
            rear = (rear + 1)%N;
            cs++;
        }
        else{
            System.out.println("Cant insert "+x +" queue full error!");
        }
    }

    void pop(){
        if(!empty()){
            front = (front+1)%N;
            cs--;
        }
    }

    int getFront(){
        return arr[front];
    }
}
