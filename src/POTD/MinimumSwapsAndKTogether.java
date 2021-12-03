package POTD;

public class MinimumSwapsAndKTogether {
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k) cnt++;
        }
        if(cnt<=1) return 0;
        int low=0,high=0;
        int minSwap = Integer.MAX_VALUE,currSwap=0;
        while(high<n){
            if(arr[high]>k) {
                currSwap++;
            }
            if((high-low)==cnt-1){
                minSwap = Math.min(minSwap,currSwap);
                if(arr[low]>k) currSwap--;
                low++;
            }
            high++;
        }
        return minSwap;
    }
}
