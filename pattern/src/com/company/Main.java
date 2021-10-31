package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no.");
        int i = 1;
        int count = 0;
        int n =  sc.nextInt();
        int s = sc.nextInt();
        while (i<=n){
            if (n%i==0){
                count++;
        }
            i = i+1;

        }
        if(count == 2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        }
    }
