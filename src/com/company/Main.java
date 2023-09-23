package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
}


class Account {
    double balance;
    double lastTransaction;
    String customerName;
    String customerId;

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            lastTransaction = amount;
        }else {
            System.out.println("Please provide a valid amount to deposit");
        }
    }

    void withdraw (double amount) {
        if (amount > 0) {
            balance = balance - amount;
            lastTransaction = -amount;
        } else{
            System.out.println("Please provide a valid amount to withdraw");
        }
    }

    void getLastTransaction () {              //Add a date that will show the date that lastTransaction happened.
        if (lastTransaction > 0) {
            System.out.println("DEPOSITED: $" + lastTransaction);
        } else if (lastTransaction < 0) {
            System.out.println("WITHDREW: $" + Math.abs(lastTransaction));
        } else{
            System.out.println("No transaction found");
        }
    }

    void showMenu() {

    }
}