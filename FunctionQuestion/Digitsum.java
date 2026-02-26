package FunctionQuestion;
import java.util.Scanner;

public class Digitsum {

    public static int Sum(int n) {
        int sum = 0;
        if (n < 10) {
            return n;
        }
        while (n > 0) {
            int k = n % 10;
            sum = sum + k;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Sum(number));
        sc.close();

    }
}
