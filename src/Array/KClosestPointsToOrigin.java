package Array;

import java.util.Arrays;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        points = mergeSort(points);
        return Arrays.copyOfRange(points,0,k);
    }
    public static double getDistance(int x,int y){
        return Math.sqrt(x*x + y*y);
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
            double d1 = getDistance(a[i][0],a[i][1]);
            double d2 = getDistance(b[j][0],b[j][1]);
            if(d1<d2){
                merged[k] = a[i];
                i++;
            }
            else {
                merged[k] = b[j];
                j++;
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
