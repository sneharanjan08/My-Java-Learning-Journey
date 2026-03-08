package Functions;

import java.util.Scanner;

public class Decimal_2_Base {
    public static int Conversion(int n,int b){
        int num=0;
        int p=1;
        if(n==0){
            return 0;
        }
        boolean isnegative=false;
        if(n<0){
            isnegative=true;
            n=-n;
        }
        while(n>0){
            int rem=n%b;
            n=n/b;
            num+=rem*p;
            p=p*10;
        }
        if(isnegative){
            num=-num;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int res=Conversion(n, b);
        System.out.println(res);
    }
}
