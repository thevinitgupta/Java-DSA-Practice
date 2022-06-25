package InterviewBit.Arrays;

import java.util.ArrayList;

public class KthRowOfPascalTriangle {
    public ArrayList<Integer> getRow(int k) {
        ArrayList<Integer> row = new ArrayList<>();

        row.add(1);
        int count = 1;
        while(count<=k){
            int i=0,j=i+1;
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);
            while(i<row.size() && j<row.size()){
                curr.add(row.get(i)+row.get(j));
                i++;
                j++;
            }
            curr.add(1);
            row = curr;
            count++;
        }
        return row;
    }
}
