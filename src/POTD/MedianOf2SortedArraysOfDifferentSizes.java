package POTD;

import java.util.Arrays;

public class MedianOf2SortedArraysOfDifferentSizes {
    static double medianOfArrays(int n, int m, int a[], int b[])
    {
        // Your Code Here
        double median = 0.0d;
        int i= 0,j=0,midInd = (n+m)/2 + 1,k=0;
        int [] merged = new int[midInd];
        while(i<n && j<m && k<midInd){
            if(a[i]<b[j]){
                merged[k] = a[i];
                i++;
            }
            else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n && k<midInd){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<m && k<midInd){
            merged[k] = b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(merged));
        if((n+m)%2==0){
            median = (merged[midInd-1]+merged[midInd-2])/2.0d;
        }
        else {
            median = merged[midInd-1];
        }
        return median;
    }

    public static void main(String[] args) {
        int [] array1 = {4};
        int [] array2 = {1,2,3,5};
        double median = medianOfArrays(1,4,array1,array2);
        System.out.println("Median : "+median);
    }
}
