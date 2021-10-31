
import java.util.Scanner;
import java.util.Arrays;
public class forloop {
    public static void main(String[] args) {
        System.out.println("enter your number length here:");
        Scanner sc = new Scanner(System.in);
        int arr = sc.nextInt();
        int[] n = new int[arr];
        System.out.println("enter your elements here:");
        for (int i = 1; i<n.length;i++){
            n[i] = sc.nextInt();
        }
        System.out.println("here is your indexes:");
        System.out.println(Arrays.toString(n));

    }
}

