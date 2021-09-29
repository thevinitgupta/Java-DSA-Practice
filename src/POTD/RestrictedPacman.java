package POTD;

public class RestrictedPacman {
    static int candies(int m, int n)
    {
        // Your code goes here
        int min = Math.min(m,n);
        int max = Math.max(m,n);
        int count = 0;
        int largest = (m * n) - (max-min);
        boolean [] nums = new boolean[largest];
        nums[0] = true;
        for(int i=1;i<largest;i = i+m){
            for(int j=i;j<largest;j=j+n){
                nums[j] = true;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(!nums[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int c = candies(7,2);
        System.out.println(c);
    }
}
