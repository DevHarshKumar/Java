package TwoDArray;

import java.util.Scanner;

public class DiagonalSum {
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Diagonal Sum");
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumL = sumL + arr[i][j];
                }
                if (i + j == (n - 1)) {
                    sumR = sumR + arr[i][j];
                }
            }
        }
        System.out.println("Sum of Left Diagonal:" + sumL);
        System.out.println("Sum of Right Diagonal:" + sumR);

        sc.close();
    }
}
