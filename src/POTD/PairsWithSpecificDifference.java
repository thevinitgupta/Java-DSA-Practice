package POTD;

import java.util.Arrays;

public class PairsWithSpecificDifference {
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K)
    {
        // Your code goes here
        Arrays.sort(arr);
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for(int i = N-1; i>0; i--){

            if(arr[i]-arr[i-1]<K){
                sum += arr[i]+arr[i-1];
                i--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {3, 5, 10, 15, 17, 12, 9};
        System.out.println(maxSumPairWithDifferenceLessThanK(arr,arr.length,4));
    }
}
