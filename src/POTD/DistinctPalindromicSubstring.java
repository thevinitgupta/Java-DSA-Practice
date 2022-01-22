package POTD;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctPalindromicSubstring {
    int palindromeSubStrs(String str) {
        int n=str.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],-1);

        HashSet<String> hs=new HashSet<>();
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(palindrome(str,i,j,dp)==1)
                    hs.add(str.substring(i,j+1));
            }
        }
        return hs.size();
    }
    static int palindrome(String s,int i,int j,int [][]dp)
    {
        if(i>j)
            return 1;

        if(dp[i][j]!=-1)
            return dp[i][j];

        if(s.charAt(i)!=s.charAt(j))
            return dp[i][j]=0;

        return dp[i][j]=palindrome(s,i+1,j-1,dp);
    }
}
