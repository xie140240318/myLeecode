package Coding;

import java.util.ArrayList;

public class T300 {

    private String name;


    public static void main(String[] args){

        int []nums={1,3,6,7,9,4,10,5,6};
        int len = nums.length;
        int [] dp =new int [len];
        dp[0]=1;
        int ans=1;
        for(int i=1;i<len;i++){
            dp[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    //System.out.println(dp[i]);

                }else{
                    continue;
                }
            }
            ans=Math.max(ans,dp[i]);
           System.out.println(ans);

            ArrayList<String> list = new ArrayList<>();
            
        }


    }
}
