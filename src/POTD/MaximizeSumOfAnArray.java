package POTD;
//Maximize sum(arr[i]*i) of an Array
import java.util.Arrays;
public class MaximizeSumOfAnArray {
    int Maximize(int arr[], int n)
    {
        // Complete the function
        int mod = (int)1e9+7;
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum = (sum + (long)arr[i] * i) % mod;

        return (int)sum;
    }

}
