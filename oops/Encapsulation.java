package com.oops;

import java.util.Scanner;

class bankAccount{
    private double balance;

    void deposit(double amount){
        if(amount > 0){
            balance+=amount;
        }
    }
    double getBalance(){
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sj = new Scanner(System.in);
        bankAccount account = new bankAccount();
        System.out.print("Enter the amount you want to add in this very beggars account:");
        account.deposit(sj.nextInt());
        double balance = account.getBalance();
        System.out.println("Current Balance: " + balance);
    }
}
