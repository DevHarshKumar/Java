import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n % 10;
        System.out.println("Last Digit:" + n1);
        while (n >= 10) {
            n = n / 10;
        }
        System.out.println("First Digit:" + n);
        sc.close();
    }
}
