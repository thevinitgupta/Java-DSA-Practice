package POTD;

public class NthRootOfM {
    public static int NthRoot(int n, int m)
    {
        // code here
        int low = 1,high = m,mid = 1;
        while(low<=high){
            mid = (low+high)/2;
            int nth = (int)Math.pow(mid,n);
            System.out.println(mid+"->"+nth);
            if(nth==m) return mid;
            else if(nth<m) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(4,1));
    }
}
