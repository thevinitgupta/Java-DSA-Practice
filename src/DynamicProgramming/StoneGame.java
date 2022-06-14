package DynamicProgramming;

public class StoneGame {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        boolean [][]dp = new boolean[n][n];
        return pick(piles, 0, n-1,0,0,dp);
    }
    public static boolean pick(int [] p, int l, int r, int alice, int bob,boolean [][]dp){
        if(l>r) return alice>bob;
        if(dp[l][r]) return true;
        dp[l][r]= pick(p,l+1,r,alice+p[l],bob,dp) || pick(p,l,r-1,alice+p[r],bob,dp);

        return dp[l][r];
    }
}
