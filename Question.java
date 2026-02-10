import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check Number is even or odd
        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        // System.out.println(n + " is Even");
        // } else {
        // System.out.println(n + " is Odd");
        // }

        // Check whether year is leap year or not
        // int n = sc.nextInt();
        // if (n % 4 == 0 || n % 400 == 0 || n % 100 == 0) {
        // System.out.println(n + " is leap year");
        // } else {
        // System.out.println(n + " is not leap year");
        // }

        // Check whether a character is alphabet or digit
        char c = sc.next().charAt(0);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            System.out.println("It is an Alphabet");
        } else if (c >= '0' && c <= '9') {
            System.out.println("It is a Digit");
        } else {
            System.out.println("It is a Special character");
        }
        sc.close();
    }
}
