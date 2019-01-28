package com.cevo.mebank.anish.codechallenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CodeChallenge {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        String fileName = args[0];//"path-to-file/filename.csv";


        Stream<String> streamedFile;
        try {
            streamedFile = getStreamfromFile(fileName);
        }catch (IOException ioe){
            ioe.printStackTrace();
            System.exit(1);
        }

        List<Transaction> transactionList = transformStreamToTransactions(streamedFile);
        RelativeBalanceCalculator rbc = new RelativeBalanceCalculator(transactionList);

        System.out.println(calculateAndGetOutputOnUserInput(rbc));


        // recursively call until exit



        try {
            Stream<String> transactions = Files.lines(Paths.get(fileName));
            transactions.forEach(transaction -> transaction.split("/,/"));
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }

    }

    private static Stream<String> getStreamfromFile(String fileNameWithPath) throws java.io.IOException {
        Stream<String> transactions = Files.lines(Paths.get(fileNameWithPath));
        return transactions;
    }

    private static List<Transaction> transformStreamToTransactions(Stream<String> transactions) {
        List<Transaction> transactionList = new ArrayList<>();
        transactions.forEach(transaction -> {
            Transaction t = new Transaction(transaction.split("/,/"));
            transactionList.add(t);
        });
        return transactionList;
    }

    private static String calculateAndGetOutputOnUserInput(RelativeBalanceCalculator rbc){
        System.out.println("Enter the From Date for Balance Calculation: ");
        LocalDateTime fromDate = LocalDateTime.parse(scanner.next(), GlobalConstants.formatter);
        System.out.println("Enter the To Date for Balance Calculation: ");
        LocalDateTime toDate = LocalDateTime.parse(scanner.next(), GlobalConstants.formatter);
        System.out.println("Enter the Account ID for Balance Calculation: ");
        String accountID = scanner.next();
        return rbc.calculateRelativeBalanceFor(accountID, fromDate, toDate);
    }
}
