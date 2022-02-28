package Array;

import java.util.ArrayList;
import java.util.List;

public class DescribeThePainting {
    public List<List<Long>> splitPainting(int[][] segments) {
        long [] points = new long[100001];
        boolean [] breaks = new boolean[100001];
        for(int i=0;i<segments.length;i++){
            int st = segments[i][0],end = segments[i][1], color = segments[i][2];
            for(int j = st;j<end;j++){
                points[j] += color;
            }
            breaks[end] = true;
        }
        List<List<Long>> splits = new ArrayList<>();
        int i=1, j = 1;
        while(i<100001 && j<100001){
            while(i<100001 && points[i]==0) i++;
            if(i==100001) break;
            i=j;
            while(j<100001 && points[i]==points[j]) {
                j++;
                if(breaks[j]) break;
            }
            if(points[i]>0){
                List<Long> curr = new ArrayList<>();
                curr.add((long)i);
                curr.add((long)j);
                curr.add(points[i]);
                splits.add(curr);
            }
            i=j;
            j=i;
        }
        return splits;
    }
}
