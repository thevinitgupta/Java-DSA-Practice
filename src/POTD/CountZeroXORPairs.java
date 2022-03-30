package POTD;

import java.util.Arrays;

public class CountZeroXORPairs {
    public static long calculate (int arr[], int n) {
        Arrays.sort(arr);
        long count=0;
        int i=0;
        int j=0;
        while(i<n){

            if(j<n-1&&arr[i]==arr[++j]){
                count++;

            }else{i++;j=i;}

        }
        return count;
    }
}
