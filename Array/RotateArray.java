package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th Number:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to rotate array:");
        int k = sc.nextInt();
        k = k % n;
        int reverse[] = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = i - k;
            if (newIndex < 0) {
                newIndex += n;
            }
            reverse[newIndex] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(reverse[i] + " ");
        }
        sc.close();
    }
}
