package Array;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ans[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element position:");
        int p = sc.nextInt();
        System.out.print("Enter Element:");
        int e = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n + 1; i++) {
            if (i != p - 1) {
                ans[i] = arr[j];
                j++;
            } else {
                ans[i] = e;
            }
        }
        System.out.print("New Array:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
