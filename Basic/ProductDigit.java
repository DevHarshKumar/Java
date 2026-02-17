import java.util.Scanner;

public class ProductDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n);
            sc.close();
            return;
        }
        int pro = 1;
        while (n >= 1) {
            int num = n % 10;
            pro = pro * num;
            n = n / 10;
        }
        System.out.println("Product:" + pro);
        sc.close();
    }
}
