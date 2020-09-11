package leecode;


//https://leetcode-cn.com/problems/edit-distance/description/
//最简单的hard
public class LC072 {
    public int minDistance(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        if(len1==0||len2==0){
            return len1+len2;
        }
        int dp[][]=new int[1+len1][1+len2];
        for (int i = 0; i <=len1; i++) {
            dp[i][0]=i;
        }
        for (int i = 0; i <=len2; i++) {
            dp[0][i]=i;
        }

        for (int i = 1; i <=len1 ; i++) {
            for (int j = 1; j <=len2 ; j++) {
                int left=dp[i][j-1]+1;
                int up=dp[i-1][j]+1;
                int leftUp=dp[i-1][j-1];
                if(word1.charAt(i-1)!=word2.charAt(j-1)){
                    leftUp+=1;
                }
                dp[i][j]=Math.min(leftUp,Math.min(left,up));
            }
        }

        return dp[len1][len2];

    }
}
