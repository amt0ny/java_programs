package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //////////SWITCH///////////
        /*int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number here");
        age = sc.nextInt();
	switch (age){
        case 18:
            System.out.println("yes you are adult");
            break;
        case 23:
            System.out.println("yes you are experienced ");
            break;
        case 60:
            System.out.println("you are going to retired");
            break;
        default:
            System.out.println("enjoy your life");  */
        /*char var = 'r';
        switch (var){
            case 'r':
                System.out.println("yes you are adult");
                break;
            case 'c':
                System.out.println("yes you are experienced ");
                break;
            case 'b':
                System.out.println("you are going to retired");
                break;
            default:
                System.out.println("enjoy your life");*/

        ////question no. 1 ////
        /*int a = 10;
        if (a == 11){
            System.out.println("a is equal to 11");}
        else {
            System.out.println("a is not equal to 11"); */

        ////question number 2 ///////
        /*int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no. in phy");
        m1 = sc.nextInt();
        System.out.println("enter your no. in math");
        m2 = sc.nextInt();
        System.out.println("enter your no. in eng.");
        m3 = sc.nextInt();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("this is your overall percentage" + avg);

        if (avg > 40 && m1 > 33 && m2 > 33 && m3 > 33) {
            System.out.println("you are qualified");}
        else {
            System.out.println("sorry you are not qualified!! try again");*/


        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your amount here");
        amount = sc.nextInt();
        float percent1 = (amount / 0.05f);
        float tax = 0;
        //float percent2 = (amount/0.2f);
        //float percent3 = (amount/0.3f);
        if (amount > 1.5 && amount <= 2.5) {
            tax = tax * 0;
        } else if (amount > 2.5 && amount <= 3.5) {
            tax = tax + 0.05f * (amount - 2.5f);
        } else if (amount > 3.5f && amount <= 5f) {
            tax = tax + 0.05f * (amount - 2.5f);
            tax = tax + 0.2f * (5f - 3.5f);
        } else {
            tax = tax + 0.05f * (amount - 2.5f);
            tax = tax + 0.2f * (5f - 3.5f);
            tax = tax + 0.3f * (10f - 5f);

        }



    }
}
    







