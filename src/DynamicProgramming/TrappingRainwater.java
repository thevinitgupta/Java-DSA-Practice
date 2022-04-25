package DynamicProgramming;

public class TrappingRainwater {
    public int trap(int[] height) {
        int amt = 0;
        for(int i=1;i<height.length;i++){
            int left = i-1, right = i+1,lMax = height[i], rMax = height[i];
            while(left>=0){
                lMax = Math.max(height[left],lMax);
                left--;
            }
            while(right<height.length){
                rMax = Math.max(height[right],rMax);
                right++;
            }
            amt += Math.min(lMax,rMax)- height[i];
        }
        return amt;
    }
}
