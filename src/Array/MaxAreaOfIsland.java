package Array;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max = Math.max(max, calcArea(grid,i,j));
                }
            }
        }
        return max;
    }
    public static int calcArea(int [][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || grid[i][j]==-1) return 0;
        grid[i][j] = -1;
        return 1+calcArea(grid,i+1,j)+calcArea(grid,i-1,j)+calcArea(grid,i,j+1)+calcArea(grid,i,j-1);

    }
}
