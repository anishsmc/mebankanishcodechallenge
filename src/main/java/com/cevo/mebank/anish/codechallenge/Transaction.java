package com.cevo.mebank.anish.codechallenge;

import java.time.LocalDateTime;

public class Transaction {

    private String transactionID;
    private String fromAccountID;
    private String toAccountID;
    private LocalDateTime createdAt;
    private long amountInCents;
    private TransactionTypes transactionType;
    private String relatedPayment;

    public Transaction(String... transactionData) {
        this.transactionID = transactionData[0];
        this.fromAccountID = transactionData[1];
        this.toAccountID = transactionData[2];
        this.createdAt = CommonFormatter.getLocalDateTimeFromString(transactionData[3]);
        this.amountInCents = CommonFormatter.convertStringCurrencyToLongStorageInCents(transactionData[4]);
        this.transactionType = TransactionTypes.valueOf(transactionData[5]);
        if(this.transactionType.equals(TransactionTypes.REVERSAL)) {
            this.relatedPayment = transactionData[6];
        }
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public long getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(long amountInCents) {
        this.amountInCents = amountInCents;
    }

    public TransactionTypes getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionTypes transactionType) {
        this.transactionType = transactionType;
    }

    public String getRelatedPayment() {
        return relatedPayment;
    }

    public void setRelatedPayment(String relatedPayment) {
        this.relatedPayment = relatedPayment;
    }
}
