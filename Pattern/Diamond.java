import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            star = star + 2;
            space = space - 1;
            System.out.println();
        }
        int star2 = 2 * (n - 1);
        int space2 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= space2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < star2; j++) {
                System.out.print("*");
            }
            star2 = star2 - 2;
            space2 = space2 + 1;
            System.out.println();
        }
        sc.close();
    }
}
