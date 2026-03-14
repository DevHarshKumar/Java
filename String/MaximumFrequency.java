package String;

import java.util.Scanner;

public class MaximumFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sentence:");
        String str = sc.next();
        int max = Integer.MIN_VALUE;
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char a = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == a) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                c = a;
            }
        }
        System.out.println("The maximum frequency of element is: " + max);
        System.out.println("the character is: " + c);
        sc.close();

    }
}
