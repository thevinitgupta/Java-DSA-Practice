package Array;

import java.util.Arrays;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean found = false;
            int next = -1;
            for(int j=0;j<nums2.length;j++){
                if(found && nums2[j]>nums1[i]) {
                    next = nums2[j];
                    break;
                }
                else if(nums2[j]==nums1[i]){
                    found=true;
                }
            }
            ans[i] = next;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] a = {3};
        int [] b = {1,5,3,4,2};
        int [] greats = nextGreaterElement(a,b);
        System.out.println(Arrays.toString(greats));
    }
}
