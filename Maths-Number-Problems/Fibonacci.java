import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int fib;
        for(int i=3;i<=n;i++){
            fib=a+b;
            System.out.println(fib);
            a=b;
            b=fib;
        }
    }
}