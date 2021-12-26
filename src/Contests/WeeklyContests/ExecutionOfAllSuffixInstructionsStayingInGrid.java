package Contests.WeeklyContests;

public class ExecutionOfAllSuffixInstructionsStayingInGrid {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length();
        int [] res = new int[m];
        for(int i=0;i<m;i++){
            int j=startPos[0],k=startPos[1];
            int count = 0,step = i;
            while(step<m && j<n && k<n){
                if(s.charAt(step)=='U'){
                    j--;
                    if(j<0) break;
                    count++;
                }
                else if(s.charAt(step)=='D'){
                    j++;
                    if(j>=n) break;
                    count++;
                }
                else if(s.charAt(step)=='L'){
                    k--;
                    if(k<0) break;
                    count++;
                }
                else{
                    k++;
                    if(k>=n) break;
                    count++;
                }
                step++;
            }
            res[i] = count;
        }
        return res;
    }
}
