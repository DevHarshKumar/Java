package Array;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th Number:");
            arr[i] = sc.nextInt();
        }
        int oddLength = 0;
        int evenLength = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenLength++;
            } else {
                oddLength++;
            }
        }
        int oddArr[] = new int[oddLength];
        int o = 0;
        int e = 0;
        int evenArr[] = new int[evenLength];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[e] = arr[i];
                e++;
            } else {
                oddArr[o] = arr[i];
                o++;
            }
        }
        System.out.println("Odd Array:-");
        for (int i = 0; i < oddLength; i++) {
            System.out.print(oddArr[i] + " ");
        }
        System.out.println();
        System.out.println("Even Array:-");
        for (int i = 0; i < evenLength; i++) {
            System.out.print(evenArr[i] + " ");
        }
        sc.close();
    }
}
