package POTD;

import java.util.Arrays;

public class MaxofMinofWindow {
    public static int[] nextSmaller(int[] arr) {
        int [] ans = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int next = arr.length;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]) {
                    next = j;
                    break;
                }
            }
            ans[i] = next;
        }
        ans[arr.length-1] = arr.length;
        System.out.println("Next Smaller : "+Arrays.toString(ans));
        return ans;
    }
    public static int[] prevSmaller(int[] arr) {
        int [] ans = new int[arr.length];
        ans[0] = -1;
        for(int i=1;i<arr.length;i++){
            int next = -1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]) {
                    next = j;
                    break;
                }
            }
            ans[i] = next;
        }
        System.out.println("Previous Smaller : "+Arrays.toString(ans));
        return ans;
    }
    static int[] maxOfMin(int[] arr, int n)
    {
        // Your code here
        int [] left = prevSmaller(arr);
        int [] right = nextSmaller(arr);
        int [] ans = new int[n+1];
        for (int i=0; i < n; i++)
        {
            int len = right[i] - left[i] - 1;
            System.out.println(len);
            ans[len] = Math.max(ans[len], arr[i]);
        }
        for (int i=n-1; i>=1; i--)
            ans[i] = Math.max(ans[i], ans[i+1]);
        return Arrays.copyOfRange(ans,1,n+1);
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,50,10,70,30};
        System.out.println(Arrays.toString(maxOfMin(arr,arr.length)));
    }
}
