import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount:");
        int P = sc.nextInt();
        System.out.print("Enter the Rate:");
        int R = sc.nextInt();
        System.out.print("Enter the Time (Annaual):");
        int T = sc.nextInt();
        int SI = (P * R * T) / 100;
        System.out.println("The Simple Interest is :" + SI);
        sc.close();
    }
}
