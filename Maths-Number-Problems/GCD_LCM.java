import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int temp1=n1;
        int temp2=n2;
        int max=0;
        int gcd=0;
        if(n1>n2){
            max=temp1;
        }else{
            max=temp2;
        }
        for(int i=1;i<=max;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        int lcm=(n1*n2)/gcd;
        System.out.println(lcm);
    }
}
