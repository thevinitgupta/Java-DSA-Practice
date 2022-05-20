package DynamicProgramming;

public class LongestCommonSubstring {
    int longestCommonSubstr(String s1, String s2, int n, int m){
        int [][] dp = new int[n+1][m+1];
        int max = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
