package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int [] nums){
        if(nums.length<=1){
            return nums;
        }
        int mid = nums.length/2;
        int [] left = Arrays.copyOfRange(nums,0,mid);
        int [] right = Arrays.copyOfRange(nums,mid,nums.length);
        return merge(sort(left),sort(right));
    }
    public static int[] merge(int []a,int [] b){
        int i=0,j=0,k=0;
        int [] merged = new int[a.length + b.length];
        while(i<a.length && j<b.length){
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
        while(i<a.length){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }
    public static void main(String[] args) {
        int [] nums = {2,5,1,8,12,1,0};
        nums = sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
