package Coding;

import java.util.Scanner;

public class TX001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();

            //int val[] = new int[n];

            int ans[]=new int[n-1];
            int count = 0;

            for (int i = 0; i < n; i++) {
                if(i==k-1){
                    in.nextInt();
                }else{
                    ans[count]=in.nextInt();
                    count++;
                }
            }

            for(int i=0;i<n-2;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.print(ans[n-2]);




        }
    }
}
