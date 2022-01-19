package POTD;

import java.util.Arrays;

public class MaxSumOfIncOrderElementsNArrays {
    public static int maximumSum (int n, int m, int arr[][]) {
        //Complete the function
        for(int i=0;i<n;i++){
            Arrays.sort(arr[i]);
        }
        int j=0,k=0;
        int prevMax = arr[n-1][m-1],sum = prevMax;
        for(int i=n-2;i>=0;i--){
            boolean found=false;
            for(j = m-1;j>=0;j--){
                if(arr[i][j]<prevMax){
                    sum += arr[i][j];
                    prevMax = arr[i][j];
                    found=true;
                    break;
                }
            }
            if(!found) return 0;
        }

        return sum;
    }
}
