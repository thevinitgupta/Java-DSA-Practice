package POTD;

public class MaximumXORSubset {
    public int maxXor(int arr[], int n)
    {
        if(n == 1)
            return arr[0];
        int i = 0;
        for(int k=30; k>=0; k--) {
            int ma = Integer.MIN_VALUE, ma_ind = -1;
            for(int j=i; j<n; j++) {
                if(((arr[j]&(1<<k))!=0) && (arr[j] > ma)){
                    ma = arr[j];
                    ma_ind = j;
                }
            }
            if(ma == Integer.MIN_VALUE)
                continue;
            int temp = arr[i];
            arr[i] = arr[ma_ind];
            arr[ma_ind] = temp;
            for(int j=0; j<n; j++) {
                if((j!= i) && ((arr[j]&(1<<k))!=0)) {
                    arr[j] ^= arr[i];
                }
            }
            i++;
        }
        int res = 0;
        for(int j=0; j<n; j++)
            res ^= arr[j];
        return res;
    }
}
