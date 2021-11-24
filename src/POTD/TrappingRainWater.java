package POTD;

public class TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        // Your code here
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int i = n-2 ;i >=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);

        }

        long total = 0;
        for(int i =1; i<n-1; i++){
            int min = Math.min(right[i],left[i]);
            total +=min-arr[i];
        }
        return total;
    }
}
