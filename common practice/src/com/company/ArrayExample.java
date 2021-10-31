package com.company;
import java.util.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {

    }


//        int ar[] = { 1, 9, 8, 3, 6, 9, 9, 5, 4, 9 };
//        //int ar[] = { 1, 5, 8, 3, 6, 8, 7, 5, 4, 9 }; //Test array
//        //int ar[] = { 1, 2, 8, 3, 6, 1, 7, 5, 4, 7 }; //Test array
//        findSetOfNumber(ar);}
//
//
//    static void findSetOfNumber(int ar[]) {
//        int sum = 0;
//        int maxSum = 0;
//        int temp1 = 0,
//                temp2 = 0;
//        for (int i = 1; i < ar.length; i++) {
//            sum = ar[i - 1] + ar[i];
//            if (sum > maxSum) {
//                maxSum = sum;
//                temp1 = i - 1;
//                temp2 = i;
//            }
//        }
//        Integer i=Integer.valueOf(temp1);
//        Integer i2 =Integer.valueOf(temp2);
//        int sum1 = ar[i] + ar[i2];
//        int sum2 =  i + i2;
//
//        System.out.println("numbers= "+ sum1);
//        System.out.println("index=" + sum2);
//    }
//}




//                int ary[] = {0,1,2,3,4,5,6,7};
//                //[0,1,2] = 3 [1,2,3] = 6 [2,3,4] = 9 [3,4,5] = 12 [4,5,6] = 15 [5,6,7] = 18
//                int i ,j,k;
//                int sum=0;
//                for ( i = 0;i<ary.length;i++){
//                    for ( j = i+1; j<ary.length &j<=i+1 ;j++){
//                        for ( k = j+1;k<ary.length &k<=j+1 ;k++){
//                            sum = ary[i]+ary[j]+ary[k];
//                            System.out.print("[");
//                            System.out.print( sum );
//                            System.out.print("] ");
//                        }
//                    }
//                }


//        for (int i = 0;i<=ary.length;i++){
//            for (int j = i+1;j<i+1;j++){
//                for (int k = j+1;k<i+2;k++){
//                    sum = ary[i]+ary[j]+ary[k];
//                    System.out.print("[");
//                    System.out.print( sum );
//                    System.out.print("] ");
//                    ary[i] = ary[j];
//                    ary[j] = ary[k];
//                    ary[k] = ary[i];
//                }
//            }
//        }

//        int ary[] = {1,4, 7};
//        Arrays.sort(ary);
//        int sum = 0;
//        int nw = 0;
//
//        for (int i = 0; i <= ary.length-1; i++) {
//            for (int j = i+1; j <= ary.length-1; j++) {
//                sum = ary[i]+ary[j];
//                if (sum%2 != 0){
//                    nw = ary[i];
//                    ary[i] = ary[j];
//                    ary[j] = nw;
//                    break;
//                }
//            }
//        }
//        for (int i = 0;i<=ary.length-1;i++){
//            System.out.println(ary[i]);
//        }


//        String  str = "oh yeah     ";
//        char [] str4 = {'o','h','y','e','a','h'};
//        String str2 = "bencho2";
//        String str5 = "OH YEAH";
//        String str3 = "";
//        str3 = str3.copyValueOf(str4,0,5);
//        System.out.println(str3);
//        System.out.println(str.charAt(5));
//        System.out.println(str.codePointAt(5));
//        System.out.println(str.codePointBefore(6));
//        System.out.println(str.codePointCount(0,7));
//        System.out.println(str.compareTo(str2));// it will tell the sum of both string's length
//        System.out.println(str.concat(str2));
//        System.out.println(str.contains("oh"));
//        System.out.println(str.contentEquals("oh yeah"));
//        System.out.println(str.contentEquals(str2));
//        System.out.println(str.endsWith("h"));
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str));// ye compare krke sab set kr btayega equal h k naii
//                                                        //-chahe case upper h ya lower
//        System.out.println(str.indexOf("o"));
//        System.out.println(str.lastIndexOf("yeah"));
//        System.out.println(str.isEmpty());
//        System.out.println(str.length());
//        System.out.println(str.replaceAll("oh","ohh"));
//        System.out.println(str.startsWith("o"));
//        System.out.println(str.subSequence(0,5));//ye char me valu print krvata h
//        System.out.println(str.substring(3));
//        System.out.println(str.substring(0,4));
//        System.out.println(str5.toLowerCase(Locale.ROOT));
//        System.out.println(str.toUpperCase(Locale.ROOT));
//        System.out.println(str.trim());//remove unwanted spaces -unwanted*
//        System.out.println(str.valueOf(0));
//        int l =10;
//        String s1 = String.valueOf(l);
//        System.out.println(l+s1);//both have value of 10 but 1 is int or another is string
//        System.out.println(l+30);// l is int so they have sum 40
//        System.out.println(s1+30);//s1 is 10 but string so it will be concat
//
//       }
//}




//}


//////////code to add a new string element in string array

//        String ary[] = { "a","b","c","d"};
//        String add = "e";
//        int l = ary.length;
//        int pos = 4;
//        System.out.println("Original length ");
//        for (int i = 0;i<ary.length;i++){
//            System.out.print(ary[i] + " " );
//        }
//        System.out.println("\n");
//        for (int i = ary.length-1;i<pos-1;i--){
//            ary[i] = ary[i+1];
//        }
//        ary[pos-1] = add;
//        for (int i=0;i<=ary.length-1;i++){
//            System.out.print(ary[i]+" ");
//        }


            ///////////binary search code
//        int ary[] = {1,2,3,4,5,6,7,8};
//        int hi = ary.length-1;
//        int number = 8;
//        int li = 0;
//        int mid = (li+hi)/2;
//        while(li<=hi){
//            if (ary[mid] == number){
//                System.out.println("your number is at index "+ mid);
//                break;
//            }
//            else if (number>ary[mid]){
//                li = mid+1;
//
//            }
//            else if (number<ary[mid]){
//                hi = mid-1;
//            }
//            mid = (li+hi)/2;
//
//        }
//    }
//}


            //////// code to 2 find repeated numbers in array
//        Scanner sc = new Scanner(System.in);
//        int ary[] = {1, 2,5, 3, 4, 4, 5,5, 6, 4, 7,5, 3};
//        int sum = 0;
//        int sum1 = 0;
//        System.out.println("Enter first element");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second element");
//        int num2 = sc.nextInt();
//        for (int i = 0; i <= ary.length - 1; i++) {
//            if (num1 == ary[i]) {
//                ary[i] = ary[1];
//                sum += ary[i];
//            }
//            else if (num2==ary[i]){
//                ary[i] = ary[1];
//
//                 sum1 += ary[i];
//            }
//        }
//        int freq = sum/2;
//        int freq2 = sum1/2;
//        if (freq>freq2){
//            System.out.println(num1 +" has frequency of " + freq+ " time");
//        }
//        else if (freq2>freq){
//            System.out.println(num2 +" has frequency of " + freq2+ " time");
//        }


//        for (int j = 0; j < ary.length; j++) {
//            if (num2 == ary[j]) {
//                ary[j] = ary[1];
//                sum1 += ary[j];
//            }
//        }
//        System.out.println(sum1);


            //////////// code to print any specific numbers separately
//        int ary[] = {0,1,0,0,1,0,0,0,1,1,0};
//        for (int i=0;i<= ary.length-1;i++) {
//            if (ary[i]<1) {
//                System.out.print(ary[i]+ " ");
//            }
//        }
//        System.out.println("\n");
//        for (int i=0;i<= ary.length-1;i++){
//            if (ary[i]==1){
//                System.out.print(ary[i]+" ");
//            }
//        }

            //////code for rotating arrays left to right

//        int ary[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Scanner sc = new Scanner(System.in);
//        int rotate = sc.nextInt();
//
//        for (int i = 0;i<=rotate-1;i++) {
//            int first = ary[0];
//            for (int j = 0; j < ary.length - 1; j++) {
//                ary[j] = ary[j + 1];
//            }
//            ary[ary.length - 1] = first;
//        }
//        for (int j = 0; j < ary.length; j++) {
//            System.out.println(ary[j]);
//        }
            // code to find missing number in th array
//        int ary[] = {1,2,3,4,6,7,8};
//        int sum = 0;
//        int sum2 = 0;
//        int n = ary[ary.length-1];
//        int l = ary.length;
//        System.out.println(n);
//        for (int i=0;i<=l-1;i++){
//            sum += ary[i];
//        }
//        for (int i =0;i<=n;i++){
//            sum2 += i;
//        }
//        System.out.println(sum2-sum);
//    }
//}

//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int ary[] = new int[n];
//        int arry[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int element = 5;
//        int li = 0;
//        int hi = arry.length-1;
//        int mid = (li + hi) / 2;
//        while (li <= hi) {
//                if (element == arry[mid]) {
//                    System.out.println("your element is at index " + mid );
//                    break;
//                }
//                else if (element>arry[mid]){
//                    li = mid+1;
//                }
//                else {
//                    hi = mid-1;
//                }
//                mid = (li+hi)/2;
//            }
//        }
//    }
//package com.company;
//import  java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ary[] = new int[n+1];
//        int arr[] = new int[0];
//        for (int i = 0;i<=n;i++){
//            ary[i] = sc.nextInt();
//            ary[i] = arr[i];
//            System.out.print(ary[i]);
//        }
//
//        for (int  i = 0;i<=n;i++){
//            ary[i] = ary.length-1;
//        }
//    }
//}

