package com.prateek.javapractice.functions2;

// Pass by value -> sending a copy of the data to the function
public class PassByValue {

    public static int incMoney(int pesa,int multiply){
        pesa = multiply*pesa;
        return pesa;
    }

    public static void doubleMoney(int pesa){
        pesa = 2*pesa;
    }

    public static void main(String[] args) {
        int money = 100;
        //int factor = 3;
        //money = incMoney(money, factor);
        doubleMoney(money);
        System.out.println(money);
    }
}
