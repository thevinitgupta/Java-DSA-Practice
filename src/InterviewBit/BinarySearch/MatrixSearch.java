package InterviewBit.BinarySearch;

import java.util.ArrayList;

public class MatrixSearch {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        int last = A.get(0).size()-1;
        for(int i=0;i<A.size();i++){
            if(B<=A.get(i).get(last) && B>=A.get(i).get(0)) return binarySearch(A.get(i),B)==-1 ? 0 : 1;
        }
        return 0;
    }
    public static int binarySearch(ArrayList<Integer> a, int t){
        int low = 0, high = a.size()-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(a.get(mid)==t) return mid;
            else if(a.get(mid)>t) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}
