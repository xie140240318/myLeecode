package Coding;

public class Laohu02 {
    public static void main(String[] args) {
        int [][] arr={{1,3,1},{1,5,1},{4,2,1}};
        int ans=uniquePaths(arr);
        System.out.println(ans);
    }
    public static int uniquePaths (int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int [][]dp=new int [m][n];
        dp[m-1][n-1]=arr[m-1][n-1];
        for(int j=n-2;j>=0;j--){
            dp[m-1][j]=dp[m-1][j+1]+arr[m-1][j];
        }
        for(int i=m-2;i>=0;i--){
            dp[i][n-1]=dp[i+1][n-1]+arr[i][n-1];
        }

        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}

