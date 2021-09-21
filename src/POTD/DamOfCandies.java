package POTD;

public class DamOfCandies {
    public static int maxCandy(int [] height, int n)
    {
        // Your code goes here
        int i=0,j = n-1,max = 0;
        while(i<j){
            int area = (j-i-1)*Math.min(height[i],height[j]);
            max = Math.max(area,max);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
    //wahan chaalak code
    public static void main(String[] args) {
        int [] height = {2, 1, 3, 4, 6, 5};
        int maxCandy = maxCandy(height,6);
        System.out.println("Max Candies stored : "+maxCandy);
    }
}
