package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        pascals.add(row);
        for(int i=1;i<numRows;i++){
            List<Integer> r = new ArrayList<>();
            r.add(1);
            for(int j=1;j<i;j++){
                r.add(pascals.get(i-1).get(j-1)+ pascals.get(i-1).get(j));
            }
            r.add(1);
            pascals.add(r);
        }
        return pascals;
    }
}
