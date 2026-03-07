package Array;

import java.util.Scanner;

public class SearchElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th Number:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search:");
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println("Index is: " + i);
                sc.close();
                return;
            }
        }
        System.out.println("Element is not present in array");
        sc.close();

    }
}
