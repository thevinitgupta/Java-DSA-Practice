package POTD;

import java.util.Arrays;

public class SumOfTwoElementsWithSumNearestToZero {
    public static int closestToZero (int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
        int i=0,j=n-1;
        int sum=0,absSum = Integer.MAX_VALUE;
        //System.out.println(Arrays.toString(arr));
        while(i<j){
            int currSum = arr[i]+arr[j];
            int absCurr = Math.abs(currSum);
            //System.out.println(i+","+j+" => "+absCurr+","+absSum);
            if(absCurr<absSum){
                sum = currSum;
                absSum = absCurr;
            }
            else if(absCurr==absSum){
                sum = Math.max(sum,currSum);
                absSum = absCurr;
            }
            if(currSum<=0) i++;
            else j--;
        }
        return sum;
    }
//-5,1,3,34
    public static void main(String[] args) {
        int [] arr1 = {29, 13, -6, -32, -12};
        int [] arr2 = {3,1,34,-5};
        int [] arr3 = {-1,2,0};
        System.out.println(closestToZero(arr1,arr1.length));
        System.out.println(closestToZero(arr2,arr2.length));
        System.out.println(closestToZero(arr3,arr3.length));
    }
}
