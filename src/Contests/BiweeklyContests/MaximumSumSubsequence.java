package Contests.BiweeklyContests;

import java.util.Arrays;

public class MaximumSumSubsequence {
    public int[] maxSubsequence(int[] nums, int k) {
        //Arrays.sort(nums);
        int n = nums.length;
        int [][]ind = new int[n][2];
        for(int i=0;i<n;i++){
            ind[i][0] = i;
            ind[i][1] = nums[i];
        }
        ind = mergeSort(ind,n,1);
        int [] res = new int[k];
        int [][] res2 = mergeSort(Arrays.copyOfRange(ind,n-k,n),k,0);
        for(int i=0;i<k;i++){
            res[i] = res2[i][1];
        }
        return res;
    }
    public int[][] mergeSort(int [][] ind,int n,int t){
        if(n<=1) return ind;
        int mid = n/2;
        int [][] leftArr = Arrays.copyOfRange(ind,0,mid);
        int [][] rightArr = Arrays.copyOfRange(ind,mid,n);

        return merge(mergeSort(leftArr,leftArr.length,t),mergeSort(rightArr,rightArr.length,t),t);
    }
    public int [][] merge(int [][] left, int [][] right,int t){
        int i=0,j=0,m=left.length,n=right.length,k=0;
        int [][] merged = new int[m+n][2];
        while(i<m && j<n){
            if(left[i][t]<right[j][t]){
                merged[k] = left[i];
                i++;
            }
            else if(right[j][t]<left[i][t]){
                merged[k] = right[j];
                j++;
            }
            else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<m){
            merged[k] = left[i];
            i++;
            k++;
        }
        while(j<n){
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }
}
