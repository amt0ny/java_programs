package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("i want to complete this java tutorial so fast");
        System.out.println("enter your number");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>60){
            System.out.println("oh yeah||");}
        else if (age>40){
            System.out.println("wow");}
        else if (age>20){
            System.out.println("nice");}
        else{
            System.out.println("just ok");}

    }
}
