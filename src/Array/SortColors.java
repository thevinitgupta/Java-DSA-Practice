package Array;

public class SortColors {
    public void sortColors(int[] nums) {
        int lo = 0, mid = 0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid]<1) {
                int temp = nums[lo];
                nums[lo] = nums[mid];
                nums[mid] = temp;
                lo++;
                mid++;
            }
            else if(nums[mid]>1) {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
            else {
                mid++;
            }
            // System.out.println(Arrays.toString(nums));
            // System.out.println("low="+lo+", mid="+mid+", high="+high);
        }
    }
    public void sortColorsCopied(int[] nums) {
        int low = 0,mid = 0,high = nums.length;
        while(mid<high){
            if(nums[high]==2) high--;
            else {
                if(nums[high]==1 && nums[mid]==2) {
                    int temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                }
            }
        }
    }
}
