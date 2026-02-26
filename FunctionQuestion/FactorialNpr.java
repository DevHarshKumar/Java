package FunctionQuestion;

import java.util.Scanner;

public class FactorialNpr {
    public static long factorial(long n) {
        long num = 1;
        for (long i = 1; i <= n; i++) {
            num = num * i;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        long n = sc.nextInt();
        System.out.println();
        System.out.print("r=");
        long r = sc.nextInt();

        if (r > n) {
            System.out.println(0);
        }
        long NPR = factorial(n) / factorial(n - r);
        System.out.println("nPr = " + NPR);
        sc.close();
    }
}