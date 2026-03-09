package TwoDArray;

import java.util.Scanner;

public class SumRowColumn {
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

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Row Sum
        System.out.println("Row Sum");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }

        // column Sum
        System.out.println("Column Sum");
        for (int i = 0; i < c; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
