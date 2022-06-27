package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletsWithSumInRange {
    public int solve(ArrayList<String> A) {
        double [] arr = new double[A.size()];
        for(int i=0;i<A.size();i++){
            arr[i] = Double.parseDouble(A.get(i));
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            double target = arr[i];
            int low = i+1, high = arr.length-1;
            while(low<high){
                double ts = arr[low]+arr[high]+target;
                if(ts>1 && ts<2) return 1;
                else if(ts<1){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return 0;
    }
}
