package Coding;

import java.util.Scanner;

public class Didi002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int nn=n*n;
            int fib[] = new int[nn];
            fib[0]=1;
            fib[1]=1;
            for(int i=2;i<nn;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
            int ans[][]=new int[n][n];

            int x=0;int y=0;
            for(int i=nn-1;i>=0;i++){
                
            }
        }
    }
}
