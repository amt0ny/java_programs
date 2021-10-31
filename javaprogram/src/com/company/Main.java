package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int R = 6;
	int F = (R/2);
	int F2 = ((R/2-1)*-1);
	System.out.println("enter your lense here");
	String lense = sc.next();
	if (lense.equals("concave"))
		System.out.println(F);
	if (lense.equals("convex"))
		System.out.println(F2);
	}




    }

