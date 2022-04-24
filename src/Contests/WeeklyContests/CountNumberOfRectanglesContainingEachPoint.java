package Contests.WeeklyContests;

public class CountNumberOfRectanglesContainingEachPoint {
    //TLE
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        int n = points.length;
        int [] count = new int[n];
        for(int i=0;i<n;i++){
            int x = points[i][0], y = points[i][1], curr = 0;
            for(int j=rectangles.length-1;j>=0;j--){
                if(x<=rectangles[j][0] && y<=rectangles[j][1]) curr++;
            }
            count[i] = curr;
        }
        return count;
    }
}
