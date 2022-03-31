package POTD;

public class NodesAtEvenDistance {
//    void dfs(vector<int> graph[], int node, int dist[],
//             bool vis[], int c)
//    {
//        if (vis[node]) {
//            return;
//        }
//        vis[node] = true;
//        dist[node] = c;
//
//        for (int i = 0; i < graph[node].size(); i++) {
//            if (!vis[graph[node][i]]) {
//                dfs(graph, graph[node][i], dist, vis, c + 1);
//            }
//        }
//    }
//
//    int countOfNodes(vector<int> graph[], int n)
//    {
//        bool vis[n + 1] = { false };
//        int dist[n + 1] = { 0 };
//
//        dfs(graph, 1, dist, vis, 0);
//
//        int even = 0, odd = 0;
//        for (int i = 1; i <= n; i++) {
//            if (dist[i] % 2 == 0) {
//                even++;
//            }
//            else {
//                odd++;
//            }
//        }
//
//        int ans = ((even * (even - 1)) + (odd * (odd - 1))) / 2;
//
//        return ans;
//    }
//};
}
