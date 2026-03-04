import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int hypo=0,base=0,perp=0;
        if(h>p && h>b){
            hypo=h;
            base=b;
            perp=p;
        }else if(b>p && b>h){
            hypo=b;
            base=h;
            perp=p;
        }else{
            hypo=p;
            base=b;
            perp=h;
        }
        if((int)Math.pow(hypo, 2)==(int)Math.pow(base, 2)+(int)Math.pow(perp, 2)){
            System.out.println("Pyrthagorean Triplets");
        }else{
            System.out.println("Not");
        }
    }
}
