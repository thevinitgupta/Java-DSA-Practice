package POTD;

import java.util.Arrays;

public class NMeetingsInARoom {
    public static int maxMeetings(int [] start, int [] end, int n)
    {
        int c =1;
        int [][] meets = new int[n][2];
        for(int i=0;i<n;i++){
            int [] meet = {start[i],end[i]};
            meets[i] = meet;
        }
        meets = MergeSort.sort(meets);
        int j=0,k=1;
        while(j<n-1 && k<n){
            if(meets[k][0]>meets[j][1]){
                c++;
                j=k;
                k++;
            }
            else {
                k++;
            }
        }
//        for(int i=0;i<meets.length;i++){
//            System.out.println(Arrays.toString(meets[i]));
//        }
        return c;
    }

    public static void main(String[] args) {
        int [] start = {10,12,20};
        int [] end =  {20,25,30};
        int count = maxMeetings(start,end,3);
        System.out.println("Max no. of meetings : "+count);
    }
}
class MergeSort {
    public static int[][] sort(int[][] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[][] left = Arrays.copyOfRange(nums, 0, mid);
        int[][] right = Arrays.copyOfRange(nums, mid, nums.length);
        return merge(sort(left), sort(right));
    }

    public static int[][] merge(int[][] a, int[][] b) {
        int i = 0, j = 0, k = 0;
        int[][] merged = new int[a.length + b.length][2];
        while (i < a.length && j < b.length) {
            if (a[i][1] < b[j][1]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            merged[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }
}
