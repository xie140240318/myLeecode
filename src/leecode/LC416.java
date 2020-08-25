package leecode;

public class LC416 {
    public boolean canPartition(int[] nums) {
        int len=nums.length;

        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if((sum&1)==1)
            return false;

        int tar=sum/2;
        boolean dp[][]=new boolean [len][tar+1];

        if(nums[0]<=tar)
            dp[0][nums[0]]=true;

        for(int i=1;i<len;i++){
            for(int j=0;j<=tar;j++){
                dp[i][j]=dp[i-1][j];
                if(nums[i]==j){
                    dp[i][j]=true;
                    continue;
                }
                if (nums[i] < j) {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[len-1][tar];
    }
}
