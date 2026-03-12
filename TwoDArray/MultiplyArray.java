package TwoDArray;

import java.util.Scanner;

public class MultiplyArray {

    public static void print(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows of 2d array");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns of 2d array:");
        int c = sc.nextInt();
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int ans[][] = new int[r][c];

        System.out.println("Enter First Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the " + i + "th row and " + j + "th column of 2d array:");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the " + i + "th row and " + j + "th column of 2d array:");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Array arr1:");
        print(arr1, r, c);
        System.out.println("Second Array arr1:");
        print(arr2, r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int k = 0; k < c; k++) {
                    sum = sum + arr1[i][k] * arr2[k][j];
                }
                ans[i][j] = sum;
                sum = 0;
            }
        }
        print(ans, r, c);
        sc.close();
    }
}
