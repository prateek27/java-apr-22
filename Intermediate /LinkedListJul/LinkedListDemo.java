package com.prateek.javapractice.LinkedListJul;

/* Node Class
class Node{
    // Data members
    int number1;
    int number2;

    // Constructor Overloading (Many function with same name)
    Node(){
    }

    Node(int a){
        number1 = a;
    }

    Node(int a,int b){
        number1 = a;
        number2 = b;
    }

    // Method
    void display(){
        System.out.println(number1 + "," + number2);
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {
        Node a = new Node(10,12);
        Node b = new Node(20);
        Node c = new Node();
        a.display();
        b.display();
    }
}
*/

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class LinkedListDemo {

    static void printLL(Node start){
        while(start!=null){
            System.out.print(start.data + "-->");
            start = start.next;
        }
        System.out.println();
    }

    //Returns the head of newly created Linked List
    static Node createLL(){
        // by reading inputs 11,2,3,4,5,6....
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //special case
        if(number==-1){
            return null;
        }

        Node head = new Node(number);
        Node tail = head;

        number = sc.nextInt();
        while(number!=-1){
            // insertion at end
            tail.next = new Node(number);
            tail = tail.next;
            number = sc.nextInt();
        }
        return head;
    }

    static int length(Node start){
        int cnt = 0;
        while(start!=null){
            cnt++;
            start = start.next;
        }
        return cnt;
    }

    static Node insertAtHead(Node head, int data){
        //special case
        if(head==null){
            return new Node(data);
        }
        // if head exists already
        Node n = new Node(data);
        n.next = head;
        head = n;
        return head;
    }

    static Node insertInMiddle(Node head,int pos,int data){
        if(pos==0){
            return insertAtHead(head,data);
        }
        // take pos-1 jumps
        Node temp = head;
        for(int jumps=1; jumps<=pos-1; jumps++){
            temp = temp.next;
        }

        // insert at middle
        Node n = new Node(data);
        n.next = temp.next;
        temp.next = n;

        return head;
    }

    public static void main(String[] args) {

        /*
        Node head = null;
        head = insertAtHead(head,17);
        printLL(head);
         */


        Node l1 = createLL();
        printLL(l1);
        // l1 = insertAtHead(l1,89);
        l1 = insertInMiddle(l1,3,33);
        printLL(l1);
        System.out.println(length(l1));

        /*
        Node head = new Node(1);
        Node tail = head;
        tail.next = new Node(2);
        tail = tail.next;

        tail.next = new Node(3);
        tail = tail.next;

        tail.next = new Node(4);
        tail = tail.next;

        // Print the entire chain
        printLL(head);
         */


        /*Create a Chain of 3 Nodes
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);*/

        /*
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        n1.next = n2;


        System.out.println(n1.data);
        System.out.println(n2.data);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1.next);
        System.out.println(n2.next);
         */
    }
}