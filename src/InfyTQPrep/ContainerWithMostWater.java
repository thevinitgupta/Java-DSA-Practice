package InfyTQPrep;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0, n = height.length, j=n-1;
        int max = 0;
        while(i<=j){
            int curr = Math.min(height[i], height[j]) * (j-i);
            max = Math.max(max, curr);

            if(height[i]<height[j]) i++;
            else j--;

        }
        return max;
    }
}
