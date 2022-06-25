package InterviewBit.Arrays;

import java.util.List;

public class FindDuplicateInArray {
    public int repeatedNumber(final List<Integer> A) {
        int [] arr = new int[A.size()];
        for(int i=0;i<A.size();i++){
            arr[i] = A.get(i);
        }
        int n=A.size();
        int j=0;
        while(arr[j]!=-1){
            int k=arr[j];
            arr[j]=-1;
            j=k;
        }
        return j;
    }
}
