package String;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String s = sc.nextLine();
        int i=0;int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("String is not Palindrome");
                sc.close();
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is palindome");
        sc.close();
    }
}
