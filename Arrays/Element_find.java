package Array;

import java.util.Scanner;

public class Element_find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int find=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                System.out.println(i);
                found=true;
            }
        }
        if(found==false){
            System.out.println("Not found");
        }
    }
}
