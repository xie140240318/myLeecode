package leecode;


class LC494 {

    public static void main(String[] args) {
        int nums[]={1,2,1};
        int ans=findTargetSumWays(nums,0);
        System.out.println(ans);
    }

    public static int findTargetSumWays(int[] nums, int S) {

        int len = nums.length;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((S + sum) % 2 != 0)
            return 0;
        if (sum < Math.max(S, -1 * S))
            return 0;

        int tar = (sum + S) / 2;

        //空间可以进行优化，使用1*（tar+1）的行来存储dp
        int dp[][] = new int[len][tar + 1];

        dp[0][0] = 1;
        if (nums[0] <= tar) {
            if (nums[0] == 0)
                dp[0][nums[0]] = 2;
            else
                dp[0][nums[0]] = 1;
        }


        for (int i = 1; i < len; i++) {
            for (int j = tar; j >= 0; j--) {
                if(j<nums[i])
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i]];
            }
        }
        return dp[len - 1][tar];
    }
}

