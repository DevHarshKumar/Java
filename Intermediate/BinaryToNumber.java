import java.util.Scanner;

public class BinaryToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (b > 0) {
            int n = b % 10;
            if (n == 0) {
                i++;
                b = b / 10;
                continue;
            }
            sum = sum + (int) Math.pow(2, i);
            b = b / 10;
            i++;
        }
        System.out.println("sum: " + sum);
        sc.close();
    }
}
