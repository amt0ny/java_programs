package com.company;
import java.util.Scanner;
import java.util.*;
import java.util.random.RandomGenerator;

public class QuickSortMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 6060;
        int upipin = 1234;

        System.out.println("Enter Your pin :");
        int enterpin = sc.nextInt();
        if (enterpin == pin) {

            int amount = 1000;
            int amount2 = 1000;
            System.out.println("Press 1 : Withdraw");
            System.out.println("Press 2 : Check balance");
            System.out.println("Press 3 : Deposit");
            System.out.println("Press 4 : Format");
            System.out.println("Press 5 : Transfer money");
            System.out.println("Press 6 : Exit");
            System.out.println("Enter your choice number");
            int press = sc.nextInt();
            if (press == 1) {
                System.out.println("Enter amount you want to  withdraw ");
                int withdraw = sc.nextInt();
                if (amount >= withdraw) {
                    int currentbalance = amount - withdraw;
                    System.out.println("Withdraw successful");
                    System.out.println("Your current balance is:  " + currentbalance);
                    amount = currentbalance;
                } else {
                    System.out.println("Oops!! Insufficient balance ");
                }
            } else if (press == 2) {
                System.out.println("your current balance is:  " + amount);
            } else if (press == 3) {
                System.out.println("Enter your amount to add");
                int deposite = sc.nextInt();
                int currentbalance = amount + deposite;
                System.out.println("Your current balance is:  " + currentbalance);
                amount = currentbalance;
            } else if (press == 4) {
                System.out.println("You have formated your amount balance :");
                amount = 0;
                System.out.println("Your current balance is: " + amount);
            } else if (press == 5) {
                System.out.println("Enter Account number, should be less than 9 Digits: ");
                int Accountnumber = 123456789;
                int enterAccountnumber = sc.nextInt();
                if (Accountnumber == enterAccountnumber) {
                    System.out.println("Enter amount you want to transfer");
                    int transfer = sc.nextInt();
                    if (transfer <= amount) {
                        System.out.println("Confirm your UPI pin");
                        int enterUPI = sc.nextInt();
                        if (enterUPI == upipin) {
                            amount = amount - transfer;
                            System.out.println("your current alance is :" + amount);
                            amount2 = amount2 + transfer;
                            System.out.println("Money successfully transferred");
                        } else {
                            System.out.println("Wrong UPI pin :(");
                        }
                    } else {
                        System.out.println("Oops !! Insufficient balance ");
                    }
                } else {
                    System.out.println("Account number not matched ");
                    System.out.println("Re Try : ");
                }

            }
        }
        System.out.println("Press 6 for exit");
        int Exit = sc.nextInt();
        int forexit  = 6;
        if (forexit==Exit){
            System.exit(0);
        }

//        else{
//            System.out.println("Wrong pin :(");
//        }
    }
}
