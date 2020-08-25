package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Didi001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();

            if(n<100||n>2000){
                System.out.println(0);
            }else{
                List<Integer> list=new ArrayList<>();
                for(int i=1;i<=999;i++){
                    int a=i/100;
                    int b=(i%100)/10;
                    int c=i%10;
                    if(a==b||b==c||c==a||a==0){
                        continue;
                    }
                    int acc=a*100+c*10+c;
                    if(i+acc==n){
                        list.add(i);
                    };

                }
                int len=list.size();
                if(len>0){
                    int ans[]=new int[len];
                    for(int i=0;i<len;i++){
                        ans[i]=list.get(i);
                    }
                    Arrays.sort(ans);
                    System.out.println(len);
                    for(int i=0;i<len;i++){
                        int acc=n-ans[i];
                        System.out.println(ans[i]+" "+acc);
                    }
                }else
                    System.out.println(0);
            }



        }
    }
}
