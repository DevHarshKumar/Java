import java.util.Scanner;

public class MorePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("First Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Second Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Third Pattern");
        int firstSpace = 0;
        int middleSpace = 1 + 2 * (n - 2);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= firstSpace; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= middleSpace; j++) {
                System.out.print(" ");
            }
            if (i != n) {
                System.out.print(i);
            }
            middleSpace = middleSpace - 2;
            firstSpace++;
            System.out.println();
        }

        firstSpace = n - 2;
        middleSpace = 1;
        for (int i = n - 1; i > 0; i--) {
            for (int j = firstSpace; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 1; j <= middleSpace; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
            middleSpace = middleSpace + 2;
            firstSpace--;
        }

        sc.close();
    }
}