package POTD;

public class FindTheNumberOfIslands {
    int visitisland(char grid[][],int i,int j,int m,int n ){

        if(i<0 || i>=m || j<0 || j>=n|| grid[i][j] == '0'){
            return 0;
        }
        grid[i][j] ='0';
        visitisland(grid,i+1,j,m,n);
        visitisland(grid,i-1,j,m,n);
        visitisland(grid,i+1,j+1,m,n);
        visitisland(grid,i-1,j-1,m,n);
        visitisland(grid,i-1,j+1,m,n);
        visitisland(grid,i+1,j-1,m,n);
        visitisland(grid,i,j+1,m,n);
        visitisland(grid,i,j-1,m,n);
        return 1;
    }

    public int numIslands(char[][] grid) {
        int noofisland = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                if(grid[i][j] == '1'){
                    noofisland+=visitisland(grid,i,j,m,n);

                }

            }
        }
        return noofisland;
    }
}
