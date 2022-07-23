package com.prateek.javapractice.StacksQueues;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class Stack {
    //data members
    Node head;

    //Init the stack (empty ll)
    Stack(){
        head = null;
    }

    // push (modify by insertion)
    void push(int d){
        Node n = new Node(d);
        n.next = head;
        head = n;
    }

    // pop (modify by deletion)
    void pop(){
        if(head!=null){
            head = head.next;
        }
    }

    //get the topmost element (read)
    int top(){
        return head.data;
    }

    // check if the LL is empty
    boolean empty(){
        return head==null;
    }

}
