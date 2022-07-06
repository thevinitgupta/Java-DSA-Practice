package InterviewBit.Arrays;

import java.util.ArrayList;

public class SetMatrixZeroes {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int m=a.size();
        int n=a.get(0).size();
        boolean row[] = new boolean[a.size()];
        boolean col[] = new boolean[a.get(0).size()];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a.get(i).get(j)==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||col[j]) a.get(i).set(j,0);
            }
        }

    }
}
