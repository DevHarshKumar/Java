package String;

import java.util.Scanner;

public class VowelConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence:");
        String str = sc.nextLine();
        int v = 0;
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                v++;
            } else if (str.charAt(i) == ' ') {
                continue;
            } else {
                c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonents: " + c);
        sc.close();

    }
}
