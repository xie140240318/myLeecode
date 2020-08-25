package Coding;

import java.util.Scanner;

public class WY001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            long a[] =new long [n];
            for(int i=0;i<n;i++){
                a[i]=in.nextLong();
            }
            long ans=0;
            for(long ai:a){
                if(ai<=1){
                    ans+=0;
                }else{
                    ai=ai>>1;
                    ans+=ai;
                }
            }
            System.out.println(ans);
        }
    }
}
