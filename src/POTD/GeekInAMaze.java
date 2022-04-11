package POTD;

import java.util.LinkedList;
import java.util.Queue;

public class GeekInAMaze {
    public static int numberOfCells(int n, int m, int r, int c, int u, int d, char mat[][])
    {
        // code here
        boolean vis[][]=new boolean[n][m];
        int dx[] = { 0, 0,-1, 1};
        int dy[] = {-1, 1, 0, 0};
        Queue<int[]> q= new LinkedList<>();
        q.offer(new int[]{r,c,0,0});
        vis[r][c]=true;
        int count=0;
        while(!q.isEmpty())
        {
            int a[]=q.poll();
            //   mat[a[0]][a[1]]='1';
            count++;
            for(int i=0;i<4;i++)
            {
                int nr=a[0]+dx[i];
                int nc=a[1]+dy[i];
                if(nr>=0 && nr<n && nc>=0  && nc<m && vis[nr][nc]==false && mat[nr][nc]=='.')
                {
                    if((a[2]==u && dx[i]==-1)||(a[3]==d && dx[i]==1))
                    {
                        continue;
                    }
                    else{
                        vis[nr][nc]=true;
                        int ku=(dx[i]==-1)?1:0;
                        int kd=(dx[i]==1)?1:0;
                        q.offer(new int[]{nr,nc,a[2]+ku,a[3]+kd});
                    }
                }
            }
        }
//       for(int i=0; i<n; i++)
// 		{
// 		    for(int j=0; j<m; j++)
// 		    if(mat[i][j]=='1')
// 		    count++;
// 		}
// 		return count;
        return count;
    }
}
