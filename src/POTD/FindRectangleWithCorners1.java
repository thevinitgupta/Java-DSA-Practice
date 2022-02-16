package POTD;

import java.util.ArrayList;
import java.util.List;

public class FindRectangleWithCorners1 {
    static boolean ValidCorner(int matrix[][])
    {
        // Your code goes here
        for(int i=0;i<matrix.length;i++){
            List<Integer> cols = new ArrayList<>();
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1) cols.add(j);
            }
            if(cols.size()>1){
                int matching = 0;
                for(int k=i+1;k<matrix.length;k++){
                    for(int l=0;l<cols.size();l++){
                        if(matrix[k][cols.get(l)]==1) matching++;
                        if(matching>1) return true;
                    }
                }
            }
        }
        return false;
    }
}
