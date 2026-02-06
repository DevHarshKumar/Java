import java.util.Scanner;

class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter A:");
        // int a = sc.nextInt();
        // System.out.println("Enter B");
        // int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("A is greater than B");
        // } else if (a == b) {
        // System.out.println("A is equal to B");
        // } else {
        // System.out.println("B is greater than A");
        // }

        // Even number

        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is Even");
        } else if (n == 0) {
            System.out.println("The number is Zero");
        } else {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}