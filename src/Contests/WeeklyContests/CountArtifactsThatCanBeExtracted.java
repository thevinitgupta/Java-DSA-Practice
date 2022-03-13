package Contests.WeeklyContests;

public class CountArtifactsThatCanBeExtracted {
    public int digArtifacts(int n, int[][] arti, int[][] dig) {
        int [][] arts = new int[n][n];
        for(int i=0;i<arti.length;i++){
            int r1 = arti[i][0],r2 = arti[i][2],c1 = arti[i][1],c2 = arti[i][3];
            for(int j=r1;j<=r2;j++){
                for(int k=c1;k<=c2;k++){
                    arts[j][k] = 1;
                }
            }
        }
        for(int i=0;i<dig.length;i++){
            int r = dig[i][0],c = dig[i][1];
            arts[r][c] = 0;
        }
        int count = 0;
        for(int i=0;i<arti.length;i++){
            int r1 = arti[i][0],r2 = arti[i][2],c1 = arti[i][1],c2 = arti[i][3];
            boolean incomplete = false;
            for(int j=r1;j<=r2;j++){
                for(int k=c1;k<=c2;k++){
                    if(arts[j][k] == 1) {
                        incomplete = true;
                        break;
                    }
                }
                if(incomplete) break;
            }
            if(!incomplete) count++;
        }
        return count;
    }
}
