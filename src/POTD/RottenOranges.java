package POTD;
import java.util.*;
public class RottenOranges {
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<int[]> queue = new LinkedList<>();


        int n = grid.length;

        int m = grid[0].length;

        int count = 0;

        for(int i = 0; i < n; i += 1)
        {
            for(int j = 0; j < m; j += 1)
            {
                if(grid[i][j] == 2) queue.add(new int[]{i, j, 0});

                if(grid[i][j] == 1) count += 1;
            }
        }


        int ans = -1;


        while(!queue.isEmpty())
        {

            int[] temp = queue.poll();

            int[] dx = {0, 0, -1, 1};

            int[] dy = {1, -1, 0, 0};

            ans = temp[2];

            for(int i = 0; i < 4; i += 1)
            {
                int x = temp[0] + dx[i];
                int y = temp[1] + dy[i];

                if(x < n && x >= 0 && y < m && y >=0 && grid[x][y] == 1)
                {
                    grid[x][y] = 2;
                    count -= 1;
                    queue.add(new int[]{x, y, temp[2] + 1});
                }
            }


        }

        if(count > 0) return -1;

        return ans;
    }
}
