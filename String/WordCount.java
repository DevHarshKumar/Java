package String;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence:");
        String str = sc.nextLine();
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space++;
            }
        }
        System.out.println("Number of words: " + (space + 1));

        sc.close();

    }
}
