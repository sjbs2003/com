package com.practice;
import java.util.Scanner;

public class AssignmentQ2 {

    public static class BankAccount {
        private final String depositorName;
        private final long accountNumber;
        private final String accountType;
        private double balance;

        // Constructor to assign initial values
        public BankAccount(String depositorName, long accountNumber, String accountType, double balance) {
            this.depositorName = depositorName;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.balance = balance;
        }

        // Method to deposit an amount
        public void deposit(double amount) {
            balance += amount;
        }

        // Method to withdraw an amount after checking the balance
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        // Method to display the name and balance
        public void display() {
            System.out.println("Depositor Name: " + depositorName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Type: " + accountType);
            System.out.println("Balance: " + balance);
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter depositor name: ");
            String name = input.nextLine();

            System.out.print("Enter account number: ");
            long accNum = input.nextLong();
            input.nextLine();
            // consume the newline character

            System.out.print("Enter account type: ");
            String type = input.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = input.nextDouble();

            // Create a BankAccount object
            BankAccount account = new BankAccount(name, accNum, type, balance);

            // Perform operations on the account
            System.out.print("Enter amount to deposit: ");
            double depositAmount = input.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = input.nextDouble();
            account.withdraw(withdrawAmount);

            // Display account information
            account.display();

            input.close();
        }
    }

}
