package String;

import java.util.Scanner;

public class MatchWord {

    public static boolean match(String s, String t, int i) {
        int l = t.length();
        int j = 0;
        while (i < s.length() && j < l) {
            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence:");
        String str = sc.nextLine();
        System.out.println("Enter your word:");
        String target = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (match(str, target, i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
