package Coding;

import java.util.Arrays;
import java.util.Scanner;

public class Ali001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N=in.nextInt();
            long trees[]=new long[(int) N];
            for(int i=0;i<N;i++){
                trees[i]=in.nextLong();
            }
            Arrays.sort(trees);
            int midindex=(N-1)/2;
            long toa=trees[midindex];

            long ans=0L;
            for(int i=0;i<=midindex;i++){
                ans+=toa-trees[i];
            }
            for(int i=midindex;i<N;i++){
                ans+=trees[i]-toa;
            }
            System.out.println(ans);
        }
    }
}
