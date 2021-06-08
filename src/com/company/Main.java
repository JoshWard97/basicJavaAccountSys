package com.company;

import java.util.Date;

//import org.json.*;
public class Main {
    private static int numOfAccs = 10;
    private static account[] accounts = new account[numOfAccs+1];
    private static transaction[] transactions = new transaction[10000];
    private static int transactionNum = 0;
    public static void main(String[] args) {
	// write your code here
        account mainAccount = new account(0,1000000.00f,"Josh","Ward");
        accounts[0] = mainAccount;
        for(int i = 1; i<=numOfAccs;i++)
        {
            account temp = new account(i,0,"Noname","Noname");
            accounts[i] = temp;
        }
        makeTransaction(0,2,1000,"Payday");
        printAccBals();
    }


    static int makeTransaction(int from,int to, float value, String desc)
    {
        // Returns an int for the transaction.
        // -1 = fromAccount ID not found
        // -2 = toAccount ID not found
        // -3 = fromAccount Balance not enough
        // These are negative. Otherwise we will return 0.
        // When the function is called, if the value is 0, the transaction was able to be made.

        // First Verify the Account's are valid, and that the "giver" account has enough in their account.
        if(accounts[from]==null)
        {
            System.out.println("FromAccount ID not valid. " + accounts[from].getAccountHolderFName());
            return -1;
        }
        if(accounts[to]==null)
        {
            System.out.println("ToAccount ID not valid");
            return -2;
        }
        if(accounts[from].getBalance()<value)
        {
            System.out.println("FromAccount Balance not enough.");
            return -3;
        }
        // If we are still executing, transaction can take place.
        accounts[from].setBalance(accounts[from].getBalance() - value);
        accounts[to].setBalance(accounts[to].getBalance() + value);
        Date timeStamp = new Date();
        transactions[transactionNum] = new transaction(from,to,value,desc,timeStamp);
        transactionNum++;

        return 0;
    }


    private static void printAccBals()
    {
        for(int i = 0; i <= numOfAccs; i++)
        {
            System.out.println("\n" + i + " Balance: $" + accounts[i].getBalance());
        }
    }
}
