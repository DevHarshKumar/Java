import java.util.Scanner;

public class AllArmstaong {

    public static boolean check(int n) {
        int count = count(n);
        int sum = power(n, count);
        if (sum == n) {
            return true;
        }
        return false;
    }

    public static int count(int n) {
        int count = 0;
        int num = n;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int power(int n, int count) {
        int sum = 0;
        int num = n;
        while (num > 0) {
            int num1 = num % 10;
            sum = sum + (int) Math.pow(num1, count);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Program to find Armstrong numbers between 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number should not be negative");
            sc.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            boolean c = check(i);
            if (c) {
                System.out.println(i);
            } else {
                continue;
            }
        }

        sc.close();
    }
}
