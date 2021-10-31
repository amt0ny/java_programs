package com.company;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String args[]) {

        //////////// for upper triangle

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        ///////////Upper bars

        int n2 = 3;
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <=2; j++) {
                System.out.print("   ");
                System.out.println("* * *           * * *");
            }

        }


//        ///////////////////////////// middle bar

        int n3 = 4;
        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("  ");

                for (j = i; j <= 11; j++) {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
            System.out.println();
            for (int j = 1; j <= 1; j++) {
                System.out.print("  ");

                for (j = i; j <= 11; j++) {
                    System.out.print(" ");
                    System.out.print("*");
                }
            }
        System.out.println();

            /////////////lower bars

        int n23 = 3;
        for (i = 1; i <= n23; i++) {
            for (int j = 1; j <=2; j++) {
                System.out.print("   ");
                System.out.println("* * *           * * *");
            }
        }
           ///////////////////////lower triangle
//
        for (i = 1; i <= n; i++) {
            for (int j = 1;j<=4;j++){
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

            }
        }


        }
    }








