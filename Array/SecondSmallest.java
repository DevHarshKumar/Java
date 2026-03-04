package Array;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th Number:");
            arr[i] = sc.nextInt();
        }
        int small = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < second && arr[i] > small) {
                second = arr[i];
            }
        }
        System.out.println("Smallest:" + small + " Second Smallest:" + second);
        sc.close();
    }
}
