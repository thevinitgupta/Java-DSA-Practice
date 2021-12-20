package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<minDiff) minDiff = arr[i]-arr[i-1];
        }
        List<List<Integer>> absDiff = new ArrayList<>();
        int j=0,k=1;
        while(k<arr.length){
            if(arr[k]-arr[j]==minDiff) {
                List<Integer> curr = new ArrayList<>();
                curr.add(arr[j]);
                curr.add(arr[k]);
                absDiff.add(curr);
            }
            k++;
            j++;
        }
        return absDiff;
    }
}
