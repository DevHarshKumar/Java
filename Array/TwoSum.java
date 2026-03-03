package Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th Number:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Element:");
        int t = sc.nextInt();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == t) {
                System.out.println(i + " " + j);
                return;
            } else if (arr[i] + arr[j] > t) {
                j--;
            } else {
                i++;
            }
        }
        sc.close();
    }
}
