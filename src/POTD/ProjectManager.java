package POTD;

public class ProjectManager {
    public int minTime(ArrayList<pair> dependency, int[] duration, int n, int m) {
        // code here
        ArrayList<Integer> v[] = new ArrayList[n+1];

        for(int i = 0; i <= n; i++)
            v[i] = new ArrayList<>();

        int[] vis = new int[n+1],deg = new int[n+1],req = new int[n+1];
        int ans = 0;

        for(pair i:dependency)
        {
            v[i.x].add(i.y);
            deg[i.y]++;
        }
        Stack<Integer> q = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(deg[i]==0)
            {
                vis[i]=1;
                q.push(i);
            }
            req[i]=duration[i];
            ans = Math.max(ans,req[i]);
        }
        while(!q.isEmpty())
        {
            int node=q.pop();
            for(int i:v[node])
            {
                deg[i]--;
                req[i]=Math.max(req[node]+duration[i],req[i]);
                if(deg[i]==0){
                    q.push(i);
                    vis[i]=1;
                    ans=Math.max(ans,req[i]);
                }
            }
        }
        for(int i=0;i<n;i++)
            if(vis[i]==0)
                return -1;
        return ans;
    }
}
