package com.cevo.mebank.anish.codechallenge;

public class Transaction {

    private String transactionID;
    private String fromAccountID;
    private String toAccountID;
    private String createdAt;
    private long amount;
    private String transactionType;
    private String relatedPayment;

    public Transaction(String... transactionData) {
        this.transactionID = transactionData[0];
        this.fromAccountID = transactionData[1];
        this.toAccountID = transactionData[2];
        this.createdAt = transactionData[3];
        this.amount = Long.parseLong(transactionData[4]);
        this.transactionType = transactionData[5];
        this.relatedPayment = transactionData[6];
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getFromAccountID() {
        return fromAccountID;
    }

    public void setFromAccountID(String fromAccountID) {
        this.fromAccountID = fromAccountID;
    }

    public String getToAccountID() {
        return toAccountID;
    }

    public void setToAccountID(String toAccountID) {
        this.toAccountID = toAccountID;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getRelatedPayment() {
        return relatedPayment;
    }

    public void setRelatedPayment(String relatedPayment) {
        this.relatedPayment = relatedPayment;
    }
}
