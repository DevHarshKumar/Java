package TwoDArray;

import java.util.Scanner;

public class ColumnTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows of 2d array");
        int r = sc.nextInt();
        System.out.println("Enter the no. of columns of 2d array:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the " + i + "th row and " + j + "th column of 2d array:");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
