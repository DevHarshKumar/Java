package FunctionQuestion;
import java.util.Scanner;

public class SecondQuestion {

    public static void check(int A, int B) {
        if (A > B) {
            System.out.println("Maximum:" + A);
            System.out.println("Minimum:" + B);
            return;
        } else if (A == B) {
            System.out.println("Maximum:" + A);
            System.out.println("Minimum:" + B);
            return;
        } else {
            System.out.println("Maximum:" + B);
            System.out.println("Minimum:" + A);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:");
        int A = sc.nextInt();
        System.out.print("B:");
        int B = sc.nextInt();
        check(A, B);
        sc.close();
    }
}
