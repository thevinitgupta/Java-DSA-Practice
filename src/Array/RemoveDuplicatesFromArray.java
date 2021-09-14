package Array;

import java.util.Arrays;

/*
* Q-26 Remove Duplicates From Array
*
* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
* */
public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(int[] nums) {
        int i=0,j,c=0;
        while(i<nums.length){
            j=i+1;
            while(j<nums.length && nums[i]==nums[j]){
                j++;
            }
            nums[c] = nums[i];
            i=j;
            c++;
        }
        System.out.println(Arrays.toString(nums));
        return  c;
    }

    public static void main(String[] args) {
        int [] nums = {0,1};
        int [] removedArray = {0,1};
        int removed = removeDuplicates(nums);
        System.out.println("Unique Array : ");
        for(int i=0;i<removed;i++){
            System.out.print(removedArray[i]+" ");
        }
    }
}
