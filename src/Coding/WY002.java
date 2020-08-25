package Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WY002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int m=in.nextInt();
            String T[]=new String[m];
            Set<String> set=new HashSet<String>();
            for(int i=0;i<m;i++){
                T[i]=in.next();
                set.add(T[i]);
            }

            String [] S=new String[n];
            for(int i=0;i<n;i++){
                S[i]= String.valueOf((i+1));
            }
            Arrays.sort(S,(a,b)->(a.compareTo(b)));
            int indexT=0;
            String nextT=T[indexT];

            int count=1;
            for(int i=0;i<n;i++){
               if(S[i].compareTo(nextT)<0){
                   if(set.contains(S[i])){
                       continue;
                   }else {
                       System.out.print(S[i]);
                       if(count<n){
                           System.out.print(" ");
                           count++;
                       }

                   }
               }else if(S[i].equals(nextT)){
                   System.out.print(nextT);
                   if(count<n){
                       System.out.print(" ");
                       count++;
                   }
                   indexT++;
                   if(indexT<m){
                       nextT=T[indexT];
                   }else{
                       nextT="9999999";
                   }
               }else if(S[i].compareTo(nextT)>0){
                   System.out.print(nextT);
                   if(count<n){
                       System.out.print(" ");
                       count++;
                   }
                   indexT++;
                   if(indexT<m){
                       nextT=T[indexT];
                   }else{
                       nextT="9999999";
                   }
                   i--;
               }
            }

        }
    }
}
