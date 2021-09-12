package Array;

/*
* 1588 :
* Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
A subarray is a contiguous subsequence of the array.
Return the sum of all odd-length subarrays of arr.

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:

* */

public class SumOfOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int l = arr.length;
        int sum = 0;
        for(int i=0;i<l;i++){
            int c = 2;
            while(i+c<l){
                int currSum = arr[i];
                for(int j = i+1;j<=i+c;j++){
                    currSum = currSum+arr[j];
                }
                c = c+2;
                sum = sum +currSum;
            }
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr = {1,4,2,5,3};
        int sumOfOdd = sumOddLengthSubarrays(arr);
        System.out.println("Sum of All Odd Length SubArrays : "+sumOfOdd);
    }
}
