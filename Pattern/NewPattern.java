import java.util.Scanner;

public class NewPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int leftSpace = n - 1;
        int middleSpace = n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == 1 || i == n) {
                for (int j = 1; j <= middleSpace; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= middleSpace; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
            leftSpace--;
        }
        sc.close();
    }
}