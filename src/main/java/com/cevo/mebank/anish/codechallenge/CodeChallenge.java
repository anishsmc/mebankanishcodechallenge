package com.cevo.mebank.anish.codechallenge;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CodeChallenge {

    public static void main(String args[]) {

        String fileName = "path-to-file/filename.csv";

        try {
            Stream<String> transactions = Files.lines(Paths.get(fileName));
            transactions.forEach(transaction -> transaction.split("/,/"));
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }

    }

    private Stream<String> getStreamfromFile(String fileNameWithPath) throws java.io.IOException {
        Stream<String> transactions = Files.lines(Paths.get(fileNameWithPath));
        return transactions;
    }

    private List<Transaction> transformStreamToTransactions(Stream<String> transactions) {
        List<Transaction> transactionList = new ArrayList<>();
        transactions.forEach(transaction -> {
            Transaction t = new Transaction(transaction.split("/,/"));
            transactionList.add(t);
        });
        return transactionList;
    }
}
