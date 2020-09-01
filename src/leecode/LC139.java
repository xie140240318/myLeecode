package leecode;

import java.util.List;

public class LC139 {
    //https://leetcode-cn.com/problems/word-break/
    public boolean wordBreak(String s, List<String> wordDict) {
        int len=s.length();
        boolean dp[]=new boolean[len+1];
        dp[0]=true;

        for(int i=1;i<=len;i++){
            for(String word:wordDict){
                int n=word.length();
                if(n<=i&&word.equals(s.substring(i-n,i)))
                    dp[i]=dp[i]||dp[i-n];

            }
        }
        return dp[len];
    }
}
