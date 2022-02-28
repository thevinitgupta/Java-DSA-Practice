package Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryOfRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int i=0,j=0,n = nums.length;
        while(i<n && j<n){
            while(j+1<n && nums[j]+1==nums[j+1]) j++;
            String str = ""+nums[i];
            if(i!=j) {
                str += "->"+nums[j];
            }
            ranges.add(str);
            i=j+1;
            j=i;
        }
        return ranges;
    }
}
