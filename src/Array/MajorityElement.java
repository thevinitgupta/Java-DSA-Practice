package Array;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    static int majorityElement(int [] a, int size)
    {
        // your code here
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<size;i++){
            if(count.containsKey(a[i])){
                int curr = count.get(a[i]);
                curr++;
                if(curr > (size/2)) return a[i];
                else count.put(a[i],curr);
            }
            else count.put(a[i],1);
        }
        return -1;
    }

    //O(1) Space Solution
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0,j=0;
        while(i<n && j<n){
            int c = 0;
            while(j<n && nums[i]==nums[j]){
                j++;
                c++;
            }
            if(c>(n/2)) return nums[i];
            i = j;
            j=i;
        }
        return 0;
    }

    //O(1) space and O(n) time
    public static int majorityElementOpt(int[] nums) {
        int n=nums.length;
        int c=0, el=0;
        for(int i=0;i<n;i++){
            if(c==0) el = nums[i];
            if(nums[i]==el) c++;
            else c--;
        }
        return el;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,8,3,2};
        System.out.println(majorityElement(arr,5));
    }
}
