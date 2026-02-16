import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Number is not prime");
            return;
        }
        if (n == 2) {
            System.out.println("Number is prime");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Number is not prime");
            return;
        }
        for (int i = 3; i * i <= n; i++) {
            if (i % n == 0) {
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
        sc.close();
    }
}
