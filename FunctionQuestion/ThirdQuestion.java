package FunctionQuestion;

import java.util.Scanner;

public class ThirdQuestion {

    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lower Limit:");
        int l = sc.nextInt();
        System.out.println();
        System.out.print("Upper Limit:");
        int u = sc.nextInt();
        for (int i = l; i <= u; i++) {
            if (check(i)) {
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}
