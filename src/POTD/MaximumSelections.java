package POTD;

import java.util.Arrays;

public class MaximumSelections {
    static int max_non_overlapping(int ranges[][], int n){
        ranges = mergeSort(ranges);
        // for(int i=0;i<n;i++){
        //     System.out.println(Arrays.toString(ranges[i]));
        // }

        int end = ranges[0][1], max=1;

        for (int i = 1; i < n; i++)
        {
            if (ranges[i][0] < end)
            {
                if( ranges[i][1] < end )
                    end = ranges[i][1];
            }
            else
            {
                max++;
                end = ranges[i][1];
            }
        }

        return max;
    }
    public static int[][] mergeSort(int [][]arr){
        if(arr.length==1) return arr;
        int mid = arr.length/2;
        return merge(mergeSort( Arrays.copyOfRange(arr,0,mid)), mergeSort(Arrays.copyOfRange(arr,mid,arr.length)));
    }
    public static int[][] merge(int[][]a,int[][]b){
        int m=a.length,n = b.length;
        int [][]merged = new int[m+n][2];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i][0]<b[j][0]){
                merged[k] = a[i];
                i++;
            }
            else if(a[i][0]>b[j][0]){
                merged[k] = b[j];
                j++;
            }
            else {
                if(a[i][1]<b[j][1]){
                    merged[k] = a[i];
                    i++;
                }
                else {
                    merged[k] = b[j];
                    j++;
                }
            }
            k++;
        }
        while(i<m){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<n){
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }
}
