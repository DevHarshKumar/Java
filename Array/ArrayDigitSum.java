package Array;

import java.util.Scanner;

public class ArrayDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Number needed to add:");
        int plus = sc.nextInt();
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = (num * 10) + arr[i];
        }
        num = num + plus;
        int tempNum = num;
        int count = 0;
        while (tempNum > 0) {
            count++;
            tempNum = tempNum / 10;
        }
        int ans[] = new int[count];
        for (int i = n - 1; i >= 0; i--) {
            int num1 = num % 10;
            ans[i] = num1;
            num = num / 10;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(ans[i] + "");
        }
        sc.close();
    }
}
