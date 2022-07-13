package com.prateek.javapractice.patterns;

public class RecursiveMoneyChange {
    static int coins[] = {1,2,5,10,20,50,100,200,500,1000,2000};

    public static void makeChange(int money){
        //base case
        if(money==0){
            return;
        }
        //rec case
        int i;
        for(i=coins.length-1; i>=0; i--){
            if(coins[i]<=money){
                break;
            }
        }
        //subproblem
        System.out.println("Pick " + coins[i]);
        int remainMoney = money - coins[i];
        makeChange(remainMoney);
    }

    public static void main(String[] args) {
        int money = 2008;
        makeChange(money);
    }
}