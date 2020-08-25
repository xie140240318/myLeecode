package Coding;

import java.util.Scanner;

public class TX004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int A[]=new int[n];

            int max=1;
            int maxIndex=0;
            for(int i=0;i<n;i++){
                A[i]=in.nextInt();
                if(max>=A[i]){

                }else{
                    max=A[i];
                    maxIndex=i;
                }
            }
            int ans=max;

            int leftindex=maxIndex-1;

            while(leftindex>0){
                if(A[leftindex]<A[leftindex-1]){
                    ans+=A[leftindex-1]-A[leftindex];
                }
                leftindex--;
            }
            int rightindex=maxIndex+1;
            while(rightindex<n-1){
                if(A[rightindex]<A[rightindex+1]){
                    ans+=A[rightindex+1]-A[rightindex];
                }
                rightindex++;
            }

            System.out.println(Math.min(ans,n));
        }
    }
}
