package Contests.LoveBabbarContest5;

/*
* You are given an array ‘ARR’ of size ‘N’ consisting of integers. The array needs to be tweaked a little bit.
Firstly, calculate ‘TotalSum’ = ‘ARR[0]’ + ‘ARR[1]’ + ... + ‘ARR[N - 1]’.
Now, for every ‘i’ (0 <= ‘i’ <= ‘N’ - 1), ‘ARR[i]’ is replaced with ‘ARR[i]’ = ‘TotalSum’ - ‘ARR[i]’.
Output the final array after tweaking it.
*
* */

public class TweakedArray {
    public static int[] tweakTheArray(int arr[],int n) {
        // Write your code here.
        int tot = 0;
        for(int i=0;i<n;i++){
            tot += arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = tot - arr[i];
        }
        return arr;
    }
}
