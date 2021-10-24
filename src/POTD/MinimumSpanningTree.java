package POTD;
import java.util.*;
public class MinimumSpanningTree {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        int[] key=new int[V];
        int res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        boolean[] mset=new boolean[V];
        for(int count=0;count<V;count++) {
            int u=-1;
            for(int i=0;i<V;i++) {
                if(!mset[i] && (u==-1 || key[i]<key[u]))
                    u=i;
            }
            mset[u]=true;
            res+=key[u];
            for(ArrayList<Integer> e:adj.get(u)) {
                int v=e.get(0);
                int w=e.get(1);
                if(!mset[v]) {
                    key[v]=Math.min(key[v],w);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number edges and vertices : ");
        int V = sc.nextInt();
        int E = sc.nextInt();
    }
}
