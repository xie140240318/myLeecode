package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MT001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            List<Integer> list=new ArrayList<>();
            for(int i=1;i<=n/4;i++){
                int zheng=i;
                int ni=i<<2;
                if(solve(zheng,ni)){
                    list.add(i);
                }
            }
            System.out.println(list.size());
            for(int num:list){
                System.out.print(num+" ");
                System.out.println(num<<2);
            }

        }
    }

    private static boolean solve(int zheng,int ni){
        String sz=String.valueOf(zheng);
        String sn=String.valueOf(ni);
        if(sz.length()!=sn.length())
            return false;

        int len=sz.length();
        for(int i=0;i<len;i++){
            if(sz.charAt(i)!=sn.charAt(len-1-i))
                return false;
        }

        return true;
    }
}
