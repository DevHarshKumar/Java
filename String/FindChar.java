package String;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence:");
        String str = sc.nextLine();
        char target = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }
}
