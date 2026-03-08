package Functions;

import java.util.Scanner;

public class Base_2_Base {
    public static int value(int n,int b1,int b2){
        int dec=Convert(n, b1);
        int res=Conversion(dec, b2);
        return res;
    }
    public static int Convert(int n,int b1){
        int num=0;
        int p=1;
        while(n>0){
            int rem=n%10;
            n=n/10 ;
            num+=rem*p;
            p=p*b1;
        }
        return num;
    }
    public static int Conversion(int n,int b2){
        int num=0;
        int p=1;
        while(n>0){
            int rem=n%b2;
            n=n/b2;
            num+=rem*p;
            p=p*10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int result=value(n, b1, b2);
        System.out.println(result);
    }
}
