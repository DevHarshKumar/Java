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
        // char c = sc.next().charAt(0);
        // if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
        // System.out.println("It is an Alphabet");
        // } else if (c >= '0' && c <= '9') {
        // System.out.println("It is a Digit");
        // } else {
        // System.out.println("It is a Special character");
        // }

        // Enter week number and print day of the week
        // int n = sc.nextInt();

        // switch (n) {
        // case 0:
        // System.out.println("Sunday");
        // break;
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Wrong Input");
        // break;
        // }

        // Print all Odd numbers from 1 to n
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i = i + 2) {
        // System.out.print(i + " ");
        // }

        // Print multiplication table of a given number
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}
