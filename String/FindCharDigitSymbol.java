package String;

import java.util.Scanner;

public class FindCharDigitSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence:");
        String str = sc.nextLine();
        int d = 0;
        int s = 0;
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                a++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                a++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                d++;
            } else if (str.charAt(i) == ' ') {
                continue;
            } else {
                s++;
            }
        }

        System.out.println("No of Digits: " + d);
        System.out.println("No of Symbols: " + s);
        System.out.println("No of Alphabets: " + a);

        sc.close();

    }
}
