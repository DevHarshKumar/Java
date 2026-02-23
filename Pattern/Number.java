import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("First Number Triangle :-");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Second Number Triangle :-");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Third Number Triangle :-");
        for (int i = n; i > 0; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
