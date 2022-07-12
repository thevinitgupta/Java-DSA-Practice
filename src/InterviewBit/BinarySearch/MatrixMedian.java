package InterviewBit.BinarySearch;

import java.util.ArrayList;

public class MatrixMedian {
    //my sol
    /*public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int i=1,j=i-1, m = A.size(), n = A.get(0).size();
        Collections.sort(A,new FirstElement());
        while(i<m){
            int l1 = 0, l2 = 0;
            ArrayList<Integer> top = A.get(j), bottom = A.get(i);
            while(l1<n && l2<n){
                if(bottom.get(l2)<top.get(l1)){
                    int temp = top.get(l1);
                    top.set(l1,bottom.get(l2));
                    while(l2+1<n && bottom.get(l2+1)<temp) l2++;
                    bottom.set(l2,temp);
                }
                l1++;
            }
            i++;
            j++;
        }
        for(i=0;i<m;i++){
            System.out.println(A.get(i));
        }
        int tot = n*m, median = tot/2;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(median==0) return A.get(i).get(j);
                median--;
            }
        }
        return 0;
    }
    */
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        if(n == 0) return -1;
        int m = A.get(0).size();
        int lo = 0;
        int hi = Integer.MAX_VALUE;
        int x = 1;
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(isLessThanHalf(A, mid)) {
                lo = mid+1;
            } else {
                x = mid;
                hi = mid-1;
            }
        }
        return x;
    }

    boolean isLessThanHalf(ArrayList<ArrayList<Integer>> a, int num) {
        int N = a.size();
        int M = a.get(0).size();
        int count = 0;

        for(int i = 0; i < N; i++) {
            count += getCount(a.get(i), num);
        }
        return count < (N*M)/2 + 1;
    }

    int getCount(ArrayList<Integer> a, int n) {
        int lo = 0;
        int hi = a.size()-1;
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(a.get(mid) > n) hi = mid-1;
            else lo = mid+1;
        }
        return lo;
    }
}
