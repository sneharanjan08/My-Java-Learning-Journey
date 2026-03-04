import java.util.Scanner;

public class Palindrome_striver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int on=n;
        int rev=0;
        while (on>0) {
            int temp=on%10;
            rev=(rev*10)+temp;
            on=on/10;
        }
        if(rev==n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
