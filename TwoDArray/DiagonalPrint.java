package TwoDArray;

import java.util.Scanner;

public class DiagonalPrint {

    public static void print(int R, int C, int arr[][], int size) {
        while (R >= 0 && C < size) {
            System.out.print(arr[R][C] + " ");
            R--;
            C++;
        }
        System.out.println();
    }

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
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            int R = i;
            int C = 0;
            print(R, C, arr, c);
        }

        for(int i=1;i<c;i++){
            int R=r-1;
            int C=i;
            print(R, C, arr, r);
        }
        sc.close();
    }
}
