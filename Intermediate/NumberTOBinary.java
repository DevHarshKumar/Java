import java.util.Scanner;
public class NumberTOBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int num=0;
        int p=1;
        for(int i=len-1;i>=0;i--){
            int n=str.charAt(i)-'0';
            if(n>0){
                num=num+p;
            }
        }
        System.out.println(num);
        sc.close();
    }
}
