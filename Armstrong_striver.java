import java.util.Scanner;

public class Armstrong_striver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int on=n;
        int temp=n;
        int sum=0;
        int count=0;
        while(on!=0){
            on=on/10;
            count++;
        }
        while(n>0){
            int id=n%10;
            sum=sum+(int)Math.pow(id, count);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
