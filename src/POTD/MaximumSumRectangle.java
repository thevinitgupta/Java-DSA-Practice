package POTD;

public class MaximumSumRectangle {
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
        int ans = Integer.MIN_VALUE;
        //first fix the 2 columns

        for(int i=0; i<C; i++){
            int[] col = new int[R];
            for(int j=i; j<C; j++){
                for(int k=0; k<R; k++)
                    col[k] += M[k][j];
                ans = Math.max(ans, kadane(col));
            }
        }
        return ans;
    }

    static int kadane(int[] arr){
        int curr = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            curr = curr+arr[i];
            max = Math.max(max, curr);
            if(curr < 0)
                curr = 0;
        }
        return max;
    }
}
