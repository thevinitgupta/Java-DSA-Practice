package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        List<List<Integer>> merged = new ArrayList<>();
        for(int k=0;k<intervals.length;k++){
            List<Integer> curr = new ArrayList<>();
            curr.add(intervals[k][0]);
            curr.add(intervals[k][1]);
            merged.add(curr);
        }
        int i = 0, j = i+1;
        while(i<merged.size() && j<merged.size()){
            while(j<merged.size() && merged.get(j).get(0)<=merged.get(i).get(1)){
                List<Integer> curr = new ArrayList<>();
                curr.add(merged.get(i).get(0));
                curr.add(Math.max(merged.get(i).get(1), merged.get(j).get(1)));
                merged.remove(j);
                merged.set(i,curr);
            }
            i++;
            j=i+1;
        }
        int [][] arr = new int[merged.size()][2];
        for(i=0;i<merged.size();i++){
            arr[i][0] = merged.get(i).get(0);
            arr[i][1] = merged.get(i).get(1);
        }
        return arr;
    }
}
