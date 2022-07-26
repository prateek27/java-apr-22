package com.prateek.javapractice.treesJul;

import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int d){
        data = d;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree(){
       //read & create tree as well
        Scanner sc = new Scanner(System.in);
        root = buildTree(sc);
    }
    //preorder build
    Node buildTree(Scanner sc){
        //read data
        int data = sc.nextInt();

        //base case
        if(data==-1){
            return null;
        }
        //Rec case
        Node n = new Node(data);
        n.left = buildTree(sc);
        n.right = buildTree(sc);
        return n;
    }

    void print(){
        postOrderPrint(root);
    }

    //helper fn for recursive printing
    void preorderPrint(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +",");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }

    void inOrderPrint(Node root){
        if(root==null){
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.data +",");
        inOrderPrint(root.right);
    }

    void postOrderPrint(Node root){
        if(root==null){
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.data +",");
    }

    int height(){
        return heightHelper(root) - 1;
    }

    private int heightHelper(Node root){
        if(root==null){
            return 0;
        }
        int h1 = heightHelper(root.left);
        int h2 = heightHelper(root.right);
        return Math.max(h1,h2) + 1;
       // return Math.max(heightHelper(root.left),heightHelper(root.right)) + 1;
    }

    int countNodes(Node root){
        if(root==null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.data + sumNodes(root.left) + sumNodes(root.right);
    }
    // Time : O(N) for all the functions
    // Space : O(Max Depth of Tree) because it uses stack space
}
