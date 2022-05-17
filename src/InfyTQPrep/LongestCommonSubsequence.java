package InfyTQPrep;

import java.util.Arrays;

public class LongestCommonSubsequence {
    static int lcs(int x, int y, String s1, String s2)
    {
        String [][] dp = new String[x+1][y+1];
        for(int i=0;i<=x;i++){
            Arrays.fill(dp[i],"");
        }
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                int top = dp[i-1][j].length(), left = dp[i][j-1].length();
                char c1 = s1.charAt(i-1), c2 = s2.charAt(j-1);
                if(c1==c2){
                    dp[i][j] = dp[i-1][j-1]+c1;
                }
                else {
                    dp[i][j] = top>left ? dp[i-1][j] : dp[i][j-1];
                }
            }
        }
        return dp[x][y].length();
    }
}
