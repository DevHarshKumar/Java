package Array;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th number:");
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                sorted = false;
            }
        }
        if (sorted == true) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        sc.close();
    }
}
