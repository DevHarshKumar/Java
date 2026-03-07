package Array;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th Number:");
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        int freq[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int count = 0;
        for (int i = 0; i < max + 1; i++) {
            if (freq[i] > 1) {
                count++;
            }
        }
        System.out.println("Total number of duplicates are: " + count);
        sc.close();
    }
}
