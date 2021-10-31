package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num>0){
            int num2 = sc.nextInt();
            int sum =0;
            int a= sc.nextInt();
            for (int i=0; i<=a;i++){
                sum=sum+i;
            }
            System.out.println(sum);
            num--;
        }
        }
    }

