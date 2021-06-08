package com.company;

public class account {

    public account(int accountNumber, float balance, String accountHolderFName, String accountHolderLName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderFName = accountHolderFName;
        this.accountHolderLName = accountHolderLName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountHolderFName() {
        return accountHolderFName;
    }

    public void setAccountHolderFName(String accountHolderFName) {
        this.accountHolderFName = accountHolderFName;
    }

    public String getAccountHolderLName() {
        return accountHolderLName;
    }

    public void setAccountHolderLName(String accountHolderLName) {
        this.accountHolderLName = accountHolderLName;
    }

    private int accountNumber;
    private float balance;
    private String accountHolderFName;
    private String accountHolderLName;

}
