package com.ATMApplication;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1212;
        double balance = 5000.00;
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("Enter Your Pin : ");
            int userpin = sc.nextInt();

            if (pin == userpin) {
                System.out.println("Login Successful...");
                int choice = 0;
                while (choice != 4) {
                    System.out.println("==============ATM MENU=================");
                    System.out.println("1.Check Balance");
                    System.out.println("2.Deposit");
                    System.out.println("3.Withdraw");
                    System.out.println("4.Exit");

                    System.out.println("\nEnter Your Choice...");
                    choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.println("Your Balance is :" + balance);
                    } else if (choice == 2) {
                        System.out.println("Enter Amount To Deposit");
                        int deposit = sc.nextInt();

                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Deposited ..After Deposit Balance: " + balance);
                        } else {
                            System.out.println("Invalid Amount");
                        }

                    } else if (choice == 3) {
                        System.out.println("Enter Amount To Withdraw");
                        int withdraw = sc.nextInt();

                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdraw Successful! After Withdraw Balance: " + balance);
                        } else {
                            System.out.println("Invalid Amount Or Insufficient Funds");
                        }
                    } else if (choice == 4) {
                        System.out.println("Thank You For Using ATM...");
                    } else {
                        System.out.println("Invalid Choice...");
                    }
                }
                break;
            } else {
                attempts++;
                System.out.println("Wrong Pin : Attempts Left :" + (3 - attempts));

                if (attempts == 3) {
                    System.out.println("Account Blocked... Too Many Attempts");
                }
            }
        }
    }
}
