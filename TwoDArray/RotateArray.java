package TwoDArray;

import java.util.Scanner;

public class RotateArray {

    public static void rotate(int[][] arr, int row, int size) {
        int i = 0;
        int j = size;
        while (i < j) {
            int temp = arr[row][i];
            arr[row][i] = arr[row][j];
            arr[row][j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2d array");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the " + i + "th row and " + j + "th column of 2d array:");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                } else {
                    continue;
                }
            }
        }
        System.out.println("Transpose of array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int end = n - 1;
            int start = 0;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("After Reversing array we get Rotated Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
