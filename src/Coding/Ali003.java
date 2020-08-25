package Coding;

import java.util.Scanner;

public class Ali003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N=in.nextInt();
            int M=in.nextInt();
            int [] map=new int [N+1];
            map[1]=1;

            for(int i=2;i<=N;i++){
                int now=in.nextInt();
                map[i]=map[now]+1;
            }
            boolean []ans=new boolean[M];
            for(int i=0;i<M;i++){
                int xq=in.nextInt();
                int xm=in.nextInt();
                int deepxq=map[xq];
                int deepxm=map[xm];
                if(deepxq<=deepxm){
                    ans[i]=true;
                }else{
                    ans[i]=false;
                }
            }

            for(int i=0;i<M;i++){
                if(ans[i])
                    System.out.println("A");
                else
                    System.out.println("B");
            }

        }
    }
}
