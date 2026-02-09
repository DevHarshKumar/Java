import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sum of all even numbers
        // System.out.print("Enter n:");
        // int n = sc.nextInt();
        // int ans = 0;
        // for (int i = 0; i <= n; i = i + 2) {
        // ans += i;
        // }
        // System.out.println("Answer is:" + ans);

        // Sum of all odd numbers
        // System.out.print("Enter n:");
        // int n = sc.nextInt();
        // int ans = 0;
        // for (int i = 1; i <= n; i = i + 2) {
        // ans += i;
        // }
        // System.out.println("Answer is:" + ans);

        // Lcm and hcf of 2 numbers
        System.out.print("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int n2 = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The Hcf of numbers is:" + hcf);
        int lcm = (n1 * n2) / hcf;
        System.out.println("The Lcm of numbers is:" + lcm);
        sc.close();
    }
}
