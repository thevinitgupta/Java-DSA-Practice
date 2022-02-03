package Array;

public class MergedSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                while(j<n-1 && nums2[j]>nums2[j+1]){
                    temp = nums2[j];
                    nums2[j] = nums2[j+1];
                    nums2[j+1] = temp;
                    j++;
                }
                j=0;
            }
            i++;
        }
        while(j<n){
            nums1[i] = nums2[j];
            j++;
            i++;
        }
    }
}
