package POTD;

public class OptimalBinarySearchTree {
    static int dp[][];
    static int sum_freq(int i,int j,int freq[]){
        int sum=0;
        for(int m=i;m<=j;m++){
            sum+=freq[m];
        }

        return sum;
    }

    static int solve(int freq[],int i,int j){
        if(i>j)
            return 0;

        if(i==j)
        {
            dp[i][j]=freq[i];
            return dp[i][j];
        }
        if(dp[i][j] != -1)
            return dp[i][j];

        int fsum=sum_freq(i,j,freq);
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int temp=solve(freq,i,k-1) + solve(freq,k+1,j);
            ans=Math.min(temp,ans);
        }

        dp[i][j] = ans+fsum;
        return dp[i][j];

    }
    static int optimalSearchTree(int keys[], int freq[], int n)
    {
        dp=new int[101][101];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return solve(freq,0,n-1);

    }
}
