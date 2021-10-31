package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 10;
        for (int i =1;i<=n; i++){
            for (int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println("======================");
        System.out.println("          ||          ");
        System.out.println("          ||          ");
//        for (int i2 =1; i2<=n; i2++){
//            for (int j2=i2; j2<=n;j2++){
//                System.out.print("* ");
//            }
//            System.out.println();
//    }
//        System.out.println("           a           ");
//        System.out.println("          a a           ");
//        System.out.println("         a   a           ");
//        System.out.println("        a  a  a          ");
//        System.out.println("       a       a        ");
//        System.out.println("      a         a        ");

    }
}
