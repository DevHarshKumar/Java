package String;

import java.util.Scanner;

public class ReverseStringWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sentence:");
        String str = sc.nextLine();
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space++;
            }
        }
        String arr[] = new String[space + 1];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < str.length() && j < str.length()) {
            if (str.charAt(j) == ' ' || str.charAt(j) == '.' || j == str.length() - 1) {
                arr[index] = str.substring(i, j);
                i = j + 1;
                index++;
            }
            j++;
        }
        for (int k = arr.length - 1; k >= 0; k--) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
