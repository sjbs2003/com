package com.practice;

public class AssignmentQ3 {
    public class Account {
        private String customerName;
        private String accountNumber;
        private String accountType;

        // Constructor
        public Account(String customerName, String accountNumber, String accountType) {
            this.customerName = customerName;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
        }

        // Getters and Setters
        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }
    }
    public class CurrentAccount extends Account {
        private double minimumBalance;
        private double serviceCharge;

        // Constructor
        public CurrentAccount(String customerName, String accountNumber, double minimumBalance) {
            super(customerName, accountNumber, "Current Account");
            this.minimumBalance = minimumBalance;
            this.serviceCharge = 0;
        }

        // Getters and Setters
        public double getMinimumBalance() {
            return minimumBalance;
        }

        public void setMinimumBalance(double minimumBalance) {
            this.minimumBalance = minimumBalance;
        }

        public double getServiceCharge() {
            return serviceCharge;
        }

        public void setServiceCharge(double serviceCharge) {
            this.serviceCharge = serviceCharge;
        }

        // Methods
        public void imposeServiceCharge(double amount) {
            if (amount < minimumBalance) {
                serviceCharge += 50; // assuming a fixed service charge of 50
            }
        }
    }

    public class SavingAccount extends Account {
        private double balance;
        private double interestRate;

        // Constructor
        public SavingAccount(String customerName, String accountNumber, double balance, double interestRate) {
            super(customerName, accountNumber, "Saving Account");
            this.balance = balance;
            this.interestRate = interestRate;
        }

        // Getters and Setters
        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        // Methods
        public double calculateInterest() {
            double interest = balance * interestRate;
            balance += interest;
            return interest;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

}
