package POTD;

public class LongestPossibleRouteWithHurdles {
    public static int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
        // code here
        int ans = solveLongestPath(mat,n,m,xs,ys,xd,yd);
        return ans < 0 ? -1 : ans;
    }

    private static int solveLongestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd){
        if(mat[xs][ys]==0) return Integer.MIN_VALUE;
        if(xs==xd && ys==yd) return 0;
        mat[xs][ys] = 0;
        int maxMovesRequired = Integer.MIN_VALUE;
        if(xs+1<n){
            maxMovesRequired = Math.max(maxMovesRequired,1+solveLongestPath(mat,n,m,xs+1,ys,xd,yd));
        }
        if(xs-1>=0){
            maxMovesRequired = Math.max(maxMovesRequired,1+solveLongestPath(mat,n,m,xs-1,ys,xd,yd));
        }
        if(ys+1<m){
            maxMovesRequired = Math.max(maxMovesRequired,1+solveLongestPath(mat,n,m,xs,ys+1,xd,yd));
        }
        if(ys-1>=0){
            maxMovesRequired = Math.max(maxMovesRequired,1+solveLongestPath(mat,n,m,xs,ys-1,xd,yd));
        }
        mat[xs][ys] = 1;
        return maxMovesRequired;
    }
}
