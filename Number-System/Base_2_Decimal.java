package Functions;

import java.util.Scanner;

public class Base_2_Decimal {
    public static int Convert(int n,int b){
        int num=0;
        int p=1;
        while(n>0){
            int rem=n%10;
            n=n/10;
            num+=rem*p;
            p=p*8;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int result=Convert(n, b);
        System.out.println(result);
    }
}
