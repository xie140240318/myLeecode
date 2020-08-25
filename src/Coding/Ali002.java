package Coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ali002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N=in.nextInt();
            int M=in.nextInt();
            Map<Integer,Integer> map =new HashMap<>();
            map.put(1,1);
            for(int i=1;i<=N;i++){
                int now=in.nextInt();
                map.put(i,map.get(Integer.valueOf(now))+1);
            }
            boolean []ans=new boolean[M];
            for(int i=0;i<M;i++){
                int xq=in.nextInt();
                int xm=in.nextInt();
                int deepxq=map.get(Integer.valueOf(xq));
                int deepxm=map.get(Integer.valueOf(xm));
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
