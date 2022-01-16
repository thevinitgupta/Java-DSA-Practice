package POTD;

import java.util.LinkedList;
import java.util.Queue;

public class StepsByKnight {
    int[][] dir=new int[][]{{-1,-2},{-1,2},{2,-1},{2,1},{1,-2},{1,2},{-2,-1},{-2,1}};
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int count=0;
        Queue<PairKnight> q=new LinkedList();
        q.add(new PairKnight(KnightPos[0]-1,KnightPos[1]-1));
        boolean[][] visited=new boolean[N][N];
        visited[KnightPos[0]-1][KnightPos[1]-1]=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size>0)
            {
                PairKnight tmp=q.poll();
                // System.out.println(count+" "+tmp.r+" "+tmp.c);
                if(tmp.r==TargetPos[0]-1&&tmp.c==TargetPos[1]-1)
                    return count;
                for(int i=0;i<8;i++)
                {
                    int nr=tmp.r+dir[i][0];
                    int nc=tmp.c+dir[i][1];
                    if(nr>=0&&nc>=0&&nr<N&&nc<N&&!visited[nr][nc])
                    {    visited[nr][nc]=true;
                        q.add(new PairKnight(nr,nc));
                    }
                }
                size--;
            }
            count++;
        }
        return -1;
    }
}

class PairKnight{
    int r;
    int c;
    PairKnight(int r,int c)
    {
        this.r=r;
        this.c=c;
    }
}
