package com.company;

import java.util.Date;

public class transaction {
    private int fromAccountNum;
    private int toAccountNum;
    private float transactionValue;
    private String transactionDesc;
    private Date timestamp;

    public transaction(int from, int to, float value, String desc, Date date) {
        fromAccountNum = from;
        toAccountNum = to;
        transactionValue = value;
        transactionDesc = desc;
        timestamp = date;
    }


    public int getFromAccountNum() {
        return fromAccountNum;
    }

    public void setFromAccountNum(int fromAccountNum) {
        this.fromAccountNum = fromAccountNum;
    }

    public int getToAccountNum() {
        return toAccountNum;
    }

    public void setToAccountNum(int toAccountNum) {
        this.toAccountNum = toAccountNum;
    }

    public float getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(float transactionValue) {
        this.transactionValue = transactionValue;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public int transcation(int fromAccountNum,int toAccountNum,float transactionValue)
    {



        return 0;
    }

}
