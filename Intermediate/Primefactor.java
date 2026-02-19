import java.util.Scanner;

public class Primefactor {

    public static boolean primecheck(int n) {
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
        int n = sc.nextInt();
        if (n == 0) {
            sc.close();
            System.out.println("Number should be greater than 0");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && primecheck(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();

    }
}
