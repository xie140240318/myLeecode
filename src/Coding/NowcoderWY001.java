package Coding;


import java.util.Arrays;
import java.util.Scanner;

public class NowcoderWY001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long n=in.nextLong();
            long r=in.nextLong();
            long avg=in.nextLong();

            long ab[][]= new long[(int) n][2];
            //int b[]=new int [n];

            long score=0;
            for(int i=0;i<n;i++){
                ab[i][0]= Long.valueOf(in.next());
                score+=ab[i][0];
                ab[i][1]= Long.valueOf(in.next());

            }
            Arrays.sort(ab,(a,b)-> (int) (a[1]-b[1]));
            long ans=0;

            for(int i=0;i<n;i++){
                if(score+r-ab[i][0]<n*avg){
                    ans+=(r-ab[i][0])*ab[i][1];
                    score+=r-ab[i][0];
                    continue;
                }else{
                    ans+=(n*avg-score)*ab[i][1];
                }
            }
            System.out.println(ans);
        }
    }
}
