package Coding;

import java.util.Scanner;

public class NowcorerWY002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int a=in.nextInt();
            //in.nextLine();
            int b[]=new int [n];
            for(int i=0;i<n;i++){
                b[i]=in.nextInt();
                if(a>=b[i]){
                    a+=b[i];
                }else{
                    a+=gys(a,b[i]);
                }
            }
            System.out.println(a);
        }
    }
    private static int gys(int a,int b){
        int temp;
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        while(true){
            if(a%b==0){
                return b;
            }else{
                temp=a%b;
                a=b;
                b=temp;
            }
        }


    }
}
