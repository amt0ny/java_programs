package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operation with 2 numbers or complete Array___");
        System.out.println("[Type 1 for 2 numbers] - [Type 0 for Array ]");
        int operation = 1;
        int operation2 = 0;
        int input1 = sc.nextInt();

        //////operations for 2 numbers

        if (input1 == operation) {
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Swap value (without 3rd variable) \n");
            System.out.println("Select Operation number");
            int op = sc.nextInt();

            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();

            int sum = a + b;
            int subtract = a - b;
            int multiply = a * b;
            int Divide = a / b;

            if (op == 1) {
                System.out.println("sum = " + sum);
            } else if (op == 3) {
                System.out.println("Multiplication = " + multiply);
            } else if (op == 2) {
                System.out.println("subtraction " + subtract);
            } else if (op == 4) {
                System.out.println("Division = " + Divide);
            } else if (op == 5) {
                System.out.println("Before swapping");
                System.out.println("a = " + a + " " + "b =" + b);
                a = a - b;
                b = a + b;
                a = a + b - (a + a);
                System.out.println("After swapping");
                System.out.println("a = " + a);
                System.out.println("b = " + b + " ");
            } else {
                System.out.println("=>Please Select valid number");
            }
        }

        ///////// operations for arrays

        else if (input1 == operation2) {
            System.out.println("Select Array one : \n ");
            System.out.println("Type 1 for [23,34,55,23,78,90,26,43]");
            System.out.println("Type 2 for [300,34,55,7,34,90,16,132]");
            System.out.println("Type 3 for [3,-13,55,3,117,90,26,-1]");
            int ary1[] = {23, 34, 55, 23, 78, 90, 26, 43};
            int ary2[] = {300, 34, 55, 7, 34, 90, 16, 132};
            int ary3[] = {3, -13, 55, 3, 117, 90, 26, -1};
            int Enter = sc.nextInt();

            ///////// first array

            if (Enter == 1) {

                System.out.println("Select operation \n");
                System.out.println("1 - Sort");
                System.out.println("2 - Find nth largest number");
                System.out.println("3 - Find largest and shortest number in array");
                System.out.println("4 - Find Even and odd numbers in Array");
                System.out.println("5 - Remove repeated number");
                int op3 = sc.nextInt();
                if (op3 == 1) {
                    Arrays.sort(ary1);
                    System.out.println(Arrays.toString(ary1));
                } else if (op3 == 2) {
                    System.out.println("Enter element you want to find...");
                    int nth = sc.nextInt();
                    for (int i = 0; i < ary1.length; i++) {
                        for (int j = i + 1; j < ary1.length; j++) {
                            if (ary1[i] < ary1[j]) {
                                int temp = ary1[i];
                                ary1[i] = ary1[j];
                                ary1[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("nth largest number is : " + ary1[i]);
                            break;
                        }
                    }
                } else if (op3 == 3) {
                    System.out.println();
                    int nth = 1;
                    for (int i = 0; i < ary1.length; i++) {
                        for (int j = i + 1; j < ary1.length; j++) {
                            if (ary1[i] < ary1[j]) {
                                int temp = ary1[i];
                                ary1[i] = ary1[j];
                                ary1[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("23,34,55,78,90,26,43");
                            System.out.println("largest number is : " + ary1[i]);
                            break;
                        }
                    }
                    for (int i = 0; i < ary1.length; i++) {
                        for (int j = i + 1; j < ary1.length; j++) {
                            if (ary1[i] > ary1[j]) {
                                int temp = ary1[i];
                                ary1[i] = ary1[j];
                                ary1[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("Smallest number is : " + ary1[i]);
                            break;
                        }
                    }
                } else if (op3 == 4) {
                    System.out.println("Odd numbers in your array");
                    for (int i = 0; i < ary1.length; i++) {
                        if (ary1[i] % 2 != 0) {
                            System.out.println(ary1[i]);
                        }
                    }
                    System.out.println("Even numbers in your array");
                    for (int i = 0; i < ary1.length; i++) {
                        if (ary1[i] % 2 == 0) {
                            System.out.println(ary1[i]);
                        }
                    }
                } else if (op3 == 5) {
                    System.out.println("confirm first that your array contains repeated element or not!");
                    int temp[] = new int[ary1.length];
                    int j = 0;
                    for (int i = 0; i < ary1.length - 1; i++) {
                        if (ary1[i] != ary1[i + 1]) {
                            temp[j] = ary1[i];
                            j++;
                        }
                    }
                    temp[j] = ary1[ary1.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        System.out.print(temp[i] + " ");
                    }

                }
            }

            ////////second array

            if (Enter == 2) {

                System.out.println("Select operation \n");
                System.out.println("1 - Sort");
                System.out.println("2 - Find nth largest number");
                System.out.println("3 - Find largest and shortest number in array");
                System.out.println("4 - Find Even and odd numbers in Array");
                System.out.println("5 - Remove repeated number");
                int op3 = sc.nextInt();
                if (op3 == 1) {
                    Arrays.sort(ary2);
                    System.out.println(Arrays.toString(ary1));
                } else if (op3 == 2) {
                    System.out.println("Enter element you want to find...");
                    int nth = sc.nextInt();
                    for (int i = 0; i < ary2.length; i++) {
                        for (int j = i + 1; j < ary2.length; j++) {
                            if (ary2[i] < ary2[j]) {
                                int temp = ary2[i];
                                ary2[i] = ary2[j];
                                ary2[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("nth largest number is : " + ary2[i]);
                            break;
                        }
                    }
                } else if (op3 == 3) {
                    System.out.println();
                    int nth = 1;
                    for (int i = 0; i < ary2.length; i++) {
                        for (int j = i + 1; j < ary2.length; j++) {
                            if (ary2[i] < ary2[j]) {
                                int temp = ary2[i];
                                ary2[i] = ary2[j];
                                ary2[j] = temp;
                            }
                        }
                        if (i == nth - 1) {

                            System.out.println("largest number is : " + ary2[i]);
                            break;
                        }
                    }
                    for (int i = 0; i < ary2.length; i++) {
                        for (int j = i + 1; j < ary2.length; j++) {
                            if (ary2[i] > ary2[j]) {
                                int temp = ary2[i];
                                ary2[i] = ary2[j];
                                ary2[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("Smallest number is : " + ary2[i]);
                            break;
                        }
                    }
                } else if (op3 == 4) {
                    System.out.println("Odd numbers in your array");
                    for (int i = 0; i < ary2.length; i++) {
                        if (ary2[i] % 2 != 0) {
                            System.out.println(ary2[i]);
                        }
                    }
                    System.out.println("Even numbers in your array");
                    for (int i = 0; i < ary2.length; i++) {
                        if (ary2[i] % 2 == 0) {
                            System.out.println(ary2[i]);
                        }
                    }
                } else if (op3 == 5) {
                    System.out.println("confirm first that your array contains repeated element or not!");
                    int temp[] = new int[ary2.length];
                    int j = 0;
                    for (int i = 0; i < ary2.length - 1; i++) {
                        if (ary2[i] != ary2[i + 1]) {
                            temp[j] = ary2[i];
                            j++;
                        }
                    }
                    temp[j] = ary2[ary2.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        System.out.print(temp[i] + " ");
                    }

                }
            }

            ////////third array

            if (Enter == 3) {

                System.out.println("Select operation \n");
                System.out.println("1 - Sort");
                System.out.println("2 - Find nth largest number");
                System.out.println("3 - Find largest and shortest number in array");
                System.out.println("4 - Find Even and odd numbers in Array");
                System.out.println("5 - Remove repeated number");
                int op3 = sc.nextInt();
                if (op3 == 1) {
                    Arrays.sort(ary3);
                    System.out.println(Arrays.toString(ary3));
                } else if (op3 == 2) {
                    System.out.println("Enter element you want to find...");
                    int nth = sc.nextInt();
                    for (int i = 0; i < ary3.length; i++) {
                        for (int j = i + 1; j < ary3.length; j++) {
                            if (ary3[i] < ary3[j]) {
                                int temp = ary3[i];
                                ary3[i] = ary3[j];
                                ary3[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("nth largest number is : " + ary3[i]);
                            break;
                        }
                    }
                } else if (op3 == 3) {
                    System.out.println();
                    int nth = 1;
                    for (int i = 0; i < ary3.length; i++) {
                        for (int j = i + 1; j < ary3.length; j++) {
                            if (ary3[i] < ary3[j]) {
                                int temp = ary3[i];
                                ary3[i] = ary3[j];
                                ary3[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("23,34,55,78,90,26,43");
                            System.out.println("largest number is : " + ary3[i]);
                            break;
                        }
                    }
                    for (int i = 0; i < ary1.length; i++) {
                        for (int j = i + 1; j < ary3.length; j++) {
                            if (ary3[i] > ary3[j]) {
                                int temp = ary3[i];
                                ary3[i] = ary3[j];
                                ary3[j] = temp;
                            }
                        }
                        if (i == nth - 1) {
                            System.out.println("Smallest number is : " + ary3[i]);
                            break;
                        }
                    }
                } else if (op3 == 4) {
                    System.out.println("Odd numbers in your array");
                    for (int i = 0; i < ary3.length; i++) {
                        if (ary3[i] % 2 != 0) {
                            System.out.println(ary3[i]);
                        }
                    }
                    System.out.println("Even numbers in your array");
                    for (int i = 0; i < ary3.length; i++) {
                        if (ary3[i] % 2 == 0) {
                            System.out.println(ary3[i]);
                        }
                    }
                } else if (op3 == 5) {
                    System.out.println("confirm first that your array contains repeated element or not!");
                    int temp[] = new int[ary3.length];
                    int j = 0;
                    for (int i = 0; i < ary3.length - 1; i++) {
                        if (ary3[i] != ary1[i + 1]) {
                            temp[j] = ary3[i];
                            j++;
                        }
                    }
                    temp[j] = ary3[ary3.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        System.out.print(temp[i] + " ");
                    }
                }
            }
        }
    }
}
