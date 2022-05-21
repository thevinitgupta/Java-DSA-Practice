package DynamicProgramming;

public class MaxPossibleAmount {

    //Incomplete solution
    int maxAmountWrong(int arr[] , int n)
    {
        return getMax(arr,0,n-1,true);
    }

    public static int getMax(int [] arr, int l, int r, boolean geekTurn){
        if(l>r) return 0;
        if(l==r) return geekTurn ? arr[l] : 0;

        int currL = geekTurn ? arr[l] : 0;
        int currR = geekTurn ? arr[r] : 0;

        currL += getMax(arr,l+1,r,!geekTurn);
        currR += getMax(arr,l,r-1,!geekTurn);

        return Math.max(currL, currR);
    }

    int maxAmount(int arr[] , int n)
    {
        int[][]dp= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return s(0,n-1,arr,dp);
    }
    static int s(int i,int j,int[]arr,int[][]dp){
        if(i>j)return 0;

        if(dp[i][j]!=-1)return dp[i][j];
        int temp=arr[i]+Math.min(s(i+1,j-1,arr,dp),s(i+2,j,arr,dp));
        int temp1=arr[j]+Math.min(s(i+1,j-1,arr,dp),s(i,j-2,arr,dp));
        return dp[i][j]=Math.max(temp,temp1);
    }
}
