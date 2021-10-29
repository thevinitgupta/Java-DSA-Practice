package POTD;

public class MinPicksToGetKPairs {
    public static int find_min(int[] a, int n, int k) {
        int max = 0;
        for(int i =0 ;i<n ;i++)
        {
            max += a[i]/2;
        }

        if(k>max)
            return -1;
        int sum = 0;
        for(int i = 0 ;i<n ;i++)
            sum+= (a[i]-1)/2;
        if(k>sum)
            return 2*sum + n +(k-sum);
        else
            return 2*(k-1)+n+1;
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 3};
        System.out.println(find_min(arr,4,6));
    }
}
