package POTD;

import java.util.*;

public class RulingPair {
    static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
    static int RulingPair(int arr[], int n) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Arrays.sort(arr);
        int maxSum = -1;
        for(int i=0;i<n;i++){
            int sum = sumOfDigits(arr[i]);
            ArrayList<Integer> a = new ArrayList<>();
            if (map.containsKey(sum)) {
                a = map.get(sum);
            }
            a.add(arr[i]);
            map.put(sum,a);
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        int k = keys.size()-1;
        while(k>=0){
            ArrayList<Integer> vals = map.get(keys.get(k));
            if(vals.size()>=2) {
                int j = vals.size()-1;
                maxSum = Math.max(maxSum,vals.get(j)+vals.get(j-1));
            }
            k--;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {55, 23, 32, 46, 88};
        System.out.println(RulingPair(arr,arr.length));
    }
}
