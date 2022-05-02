package DynamicProgramming;

public class TrappingRainwater {
    public int trap(int[] height) {
        int n = height.length;
        int [] rMax = new int[n];
        int [] lMax = new int[n];
        rMax[n-1] = -1;
        lMax[0] = -1;

        for(int i=n-2;i>=0;i--){
            rMax[i] = Math.max(rMax[i+1], height[i+1]);
        }
        for(int i=1;i<n;i++){
            lMax[i] = Math.max(lMax[i-1], height[i-1]);
        }
        int amt = 0;
        for(int i=0;i<n;i++){
            int cMin = Math.min(lMax[i],rMax[i]);
            if(cMin>height[i]){
                amt += cMin-height[i];
            }
        }
        return amt;
    }
    public int trap2(int[] height) {
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
