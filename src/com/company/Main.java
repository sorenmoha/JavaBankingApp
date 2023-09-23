package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account obj1 = new Account("John", "Deere", "12345678");
        obj1.showMenu();


    }
}


class Account {
    double balance;
    double lastTransaction;
    String customerFirstName;
    String customerLastName;
    String customerId;

    Account(String custFirstName, String custLastName, String custId) {
        customerFirstName = custFirstName;
        customerLastName = custLastName;
        customerId = custId;
    }

    //deposit an amount to balance

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            lastTransaction = amount;
        } else {
            System.out.println("Please provide a valid amount to deposit");
        }
    }

    //withdraw an amount to balance

    void withdraw(double amount) {
        if (amount > 0) {
            balance = balance - amount;
            lastTransaction = -amount;
        } else {
            System.out.println("Please provide a valid amount to withdraw");
        }
    }

    //retrieve the last transaction made

    void getLastTransaction() {              //Add a date that will show the date that lastTransaction happened.
        if (lastTransaction > 0) {
            System.out.println("DEPOSITED: $" + lastTransaction);
        } else if (lastTransaction < 0) {
            System.out.println("WITHDREW: $" + Math.abs(lastTransaction));
        } else {
            System.out.println("No transaction found");
        }
    }

    void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerFirstName + " " +customerLastName);
        System.out.println("Account ID: " + customerId);
        System.out.println("\n");
        System.out.println("A: View balance");
        System.out.println("B: Withdraw");
        System.out.println("C: Deposit");
        System.out.println("D: View last transaction");
        System.out.println("E: Exit");

        do {
            System.out.println("======================================================================");
            System.out.println("Thanks for visiting Bank of Banking, What would you like to do today?");
            System.out.println("======================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("========================");
                    System.out.println("Balance = " + balance);
                    System.out.println("========================");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("========================");
                    System.out.println("Please enter an amount to withdraw");
                    System.out.println("========================");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("========================");
                    System.out.println("Please enter an amount to Deposit");
                    System.out.println("========================");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("========================");
                    System.out.println("Your last transaction was: ");
                    getLastTransaction();
                    System.out.println("========================");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("=====================G=0=0=D==B=Y=E============================");
                    break;

                default:
                    System.out.println("You chose an invalid option, please try again");
                    break;
            }
        } while(option != 'E');

        System.out.println("Thank you for choosing Bank of Banking, have a nice day!");
    }
}