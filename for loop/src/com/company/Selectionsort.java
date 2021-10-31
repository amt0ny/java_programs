package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  temp = 0;
        System.out.println("Enter your length");
       int n = sc.nextInt();//{ 40,32,43,45,560,21,12}
       int a[] = new int[n];
        System.out.println("Enter your elements");
       for (int i = 0; i<n; i++){
           a[i] = sc.nextInt();
       }
       for (int i = 0; i<n;i++){
           for (int j =i+1; j<n;j++){
               if (a[i]>a[j]){
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
       }
       for (int  i = 0;i<n;i++){
           System.out.print(a[i] + " ");
       }
    }
}



