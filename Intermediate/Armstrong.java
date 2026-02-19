import java.util.Scanner;

public class Armstrong {

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number should not be negative");
            sc.close();
            return;
        }
        int count = count(n);
        int sum = power(n, count);
        System.out.println("Sum:" + sum);

        if (sum == n) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
        sc.close();
    }
}
