package com.company;

        import java.util.*;
class Main<man1, man3> {
    // Take input of age of 3 people by user and determine oldest and youngest among them.e.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your class held");
        float held = sc.nextInt();
        System.out.println("enter class attended");
        float attnd = sc.nextInt();
        float prcnt = (attnd/held)*100f;
        System.out.println(prcnt);
        if (prcnt>=75f){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

    }
}




