package com.cevo.mebank.anish.codechallenge;

import java.time.LocalDateTime;
import java.util.List;

public class RelativeBalanceCalculator {
    private List<Transaction> transactionList;

    public RelativeBalanceCalculator(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }


    public void calculateRelativeBalanceFor(String accountID, LocalDateTime fromDateTime, LocalDateTime toDateTime){

    }
}
