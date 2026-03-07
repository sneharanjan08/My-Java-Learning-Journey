//x * 1 = x
//x * 2 = 2x
//x * 3 = 3x
//x * 4 = 4x  .....
//x * 10 = 10x

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(n+"*"+i+"="+n*i);
            System.out.println();
        }
    }
}
