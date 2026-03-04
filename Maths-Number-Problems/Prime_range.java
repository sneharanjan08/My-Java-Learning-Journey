import java.util.Scanner;

public class Prime_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println("Prime"+i);
            }else{
                System.out.println("Not prime"+i);
            }
        }
    }
}
