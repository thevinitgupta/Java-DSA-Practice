package POTD;

public class ExactlyOneSwap {
    long countStrings(String S)
    {
        long [] hash = new long[26];
        long [] dp = new long[S.length()];
        hash[S.charAt(0)-97]++;
        for(int i=1;i<S.length();i++){
            dp[i] = dp[i-1] + i - hash[S.charAt(i)-97];
            hash[S.charAt(i)-97]++;
        }
        for(int i = 0;i<26;i++){
            if(hash[i]>=2) {
                dp[S.length()-1]++;
                break;
            }
        }
        return dp[S.length()-1];
    }
}
