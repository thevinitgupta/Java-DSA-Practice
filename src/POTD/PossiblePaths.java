package POTD;

public class PossiblePaths {
    public int mod=1000000007;
    public Integer[][] dp=null;
    public int MinimumWalk(int[][] graph, int u, int v, int k)
    {
        dp=new Integer[graph.length][k+1];
        return dfs(graph,u,v,k);
    }
    public int dfs(int[][] graph,int curr,int target,int count){
        if(dp[curr][count]!=null){
            return dp[curr][count];
        }
        if(count==0){
            if(curr==target){
                return 1;
            }
            return 0;
        }
        int ans=0;
        for(int j=0;j<graph.length;j++){
            if(graph[curr][j]==1){
                ans=(ans+dfs(graph,j,target,count-1))%mod;
            }
        }
        dp[curr][count]=ans;
        return dp[curr][count];
    }
}
