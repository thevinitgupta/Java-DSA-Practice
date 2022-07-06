package InterviewBit.Arrays;


import java.util.ArrayList;

public class MaxMin {
    static class Pair {
        int max, min;
        Pair(int a, int b){
            this.max = a;
            this.min = b;
        }
    }
    public int solve(ArrayList<Integer> A) {
        int mid = (A.size()-1)/2;
        Pair p1 = maxMin(A,0,mid);
        Pair p2 = maxMin(A,mid,A.size()-1);
        return Math.max(p1.max,p2.max)+Math.min(p2.min,p1.min);
    }
    public static Pair maxMin(ArrayList<Integer> a, int low, int high){
        if(low==high) return new Pair(a.get(low),a.get(low));
        if(low==high-1){
            int min = Math.min(a.get(low),a.get(high));
            int max = Math.max(a.get(low),a.get(high));
            return new Pair(max,min);
        }
        int mid = low + (high-low)/2;
        Pair p1 = maxMin(a,low,mid);
        Pair p2 = maxMin(a,mid,high);
        return new Pair(Math.max(p1.max,p2.max),Math.min(p2.min,p1.min));
    }
}
