package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<18){
            System.out.println("no boy.. you are not eligible for vote");
        }
        else if (age>=18){
            System.out.println("yes boy.. you are eligible for vote");
        }



    }
}
