package Contests.WeeklyContests;

public class SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        int i=0,j=1,n=nums.length;
        if(n==1) return 0;
        int min =0;
        int max = 0;
        long sum = 0;
        while(i<n-1){
            max = nums[i];
            min = nums[i];
            j=i+1;
            while(j<n){
                //System.out.println(i+", "+j);
                min = Math.min(min,nums[j]);
                max = Math.max(max,nums[j]);
                //System.out.println(max+", "+min);
                long curr = max-min;
                sum += curr;
                //System.out.println(sum);
                j++;
            }
            i++;
        }
        return sum;
    }
}
