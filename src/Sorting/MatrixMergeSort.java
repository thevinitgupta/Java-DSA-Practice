package Sorting;

import java.util.Arrays;

public class MatrixMergeSort {
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
            if(a[i][1]>b[j][1]){
                merged[k] = a[i];
                i++;
            }
            else if(a[i][1]<b[j][1]){
                merged[k] = b[j];
                j++;
            }
            else {
                if(a[i][0]>b[j][0]){
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
