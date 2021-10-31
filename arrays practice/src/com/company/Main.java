package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int not =0;
        int n = 0;


        int ary[] = {4,300,6,9,30,44,3,1,100,80};
        System.out.println("Enter your number who's you want find index : ");
        int num = sc.nextInt();

        for (int i = 0;i<ary[i];i++){
            if(num==ary[i]) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("no");
    }
}
