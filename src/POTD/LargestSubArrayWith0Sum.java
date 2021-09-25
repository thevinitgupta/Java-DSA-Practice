package POTD;

import java.util.HashMap;

public class LargestSubArrayWith0Sum {
    //HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
    static int maxLen(int [] arr, int n)
    {
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        //15,13,15,7,8,15,25,48
        //int [] sums = new int[arr.length];
        int prevSum = arr[0];
        hm.put(arr[0],0);
        int max = 0;
        for(int i=1;i<arr.length;i++){
            int currSum = prevSum + arr[i];
            prevSum = currSum;
            if(currSum==0){
                int curr = i+1;
                max = Math.max(curr,max);
            }
            else if(hm.get(currSum)!=null) {
                int curr = (i - hm.get(currSum));
                max = Math.max(curr,max);
            }
            else {
                hm.put(currSum,i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {-1,1,-1,1};
        int maxLen = maxLen(arr,8);
        System.out.println(maxLen);
    }
}
