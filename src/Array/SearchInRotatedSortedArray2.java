package Array;

public class SearchInRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {
        int pi = 0, n = nums.length;
        while(pi<n-1 && nums[pi]<=nums[pi+1]) pi++;
        int low = 0, high = n-1;
        if(target>=nums[low] && target<= nums[pi]) {
            high = pi;
        }
        else low = pi+1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return true;
            else if(target>nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
