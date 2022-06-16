package BitManipulation;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i]^i;
        }
        return xor;
    }
}
