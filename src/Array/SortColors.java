package Array;

public class SortColors {
    public void sortColors(int[] nums) {
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
