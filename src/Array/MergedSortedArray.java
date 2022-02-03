package Array;

public class MergedSortedArray {
    public void mergeOpt(int[] nums1, int m, int[] nums2, int n){
        int k= m+n-1, i=m-1,j = n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
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
