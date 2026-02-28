package Array;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = sc.nextInt();
        boolean present = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                present = true;
                break;
            }
        }
        System.out.println(present);
        sc.close();
    }
}
