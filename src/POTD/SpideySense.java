package POTD;

import java.util.LinkedList;
import java.util.Queue;
class PairS {
    int x,y;
    PairS(int x, int y){
        this.x = x;
        this.y= y;
    }
}
public class SpideySense {
    public static int[][] findDistance(char mat[][], int m,int n)
    {
        // Your code goes here

        int dist[][] = new int[m][n];

        for(int i = 0; i<m; i++) {
            for(int j=0; j<n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        Queue<PairS> q = new LinkedList<>();
        boolean visited[][] = new boolean[m][n];
        for(int i = 0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] == 'B') {
                    q.add(new PairS(i, j));
                    visited[i][j] = true;
                    dist[i][j] = 0;
                } else if(mat[i][j] == 'W') {
                    dist[i][j] = -1;
                }
            }
        }

        int[] rowNum = {0, 1, -1, 0};
        int[] colNum = {1, 0, 0, -1};

        while(!q.isEmpty()) {
            PairS curr = q.poll();

            int row = curr.x;
            int col = curr.y;

            for(int i = 0; i<4; i++) {
                int r = row + rowNum[i];
                int c = col + colNum[i];

                if(r>=0 && c>=0 && r<m && c<n && mat[r][c]!='W' && visited[r][c]!=true) {
                    dist[r][c] = dist[row][col] + 1;
                    q.add(new PairS(r,c));
                    visited[r][c] = true;
                }
            }

        }

        for(int i = 0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(dist[i][j] == Integer.MAX_VALUE) {
                    dist[i][j] = -1;
                }
            }
        }

        return dist;

    }
}
