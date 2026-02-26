import java.util.Scanner;

public class OnrMorePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int Space = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= Space * 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            Space++;
        }

        Space = n - 1;
        star = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= Space * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            Space--;
            star++;

        }
        sc.close();
    }
}
