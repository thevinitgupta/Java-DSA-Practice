package Contests.HackWithInfy;

import java.util.*;

public class LongestSubsequenceWithSumGreaterThanZero {
    public static int longestSubsequence(List<Integer> arr, int n){
        long sum = 0,posSum = 0;
        int last = -1;
        Collections.sort(arr);
        System.out.println(arr);
        HashMap<Integer, Integer> neg = new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr.get(i)<0){
                last = i;
            }
            else posSum += arr.get(i);
            sum += arr.get(i);
        }
        if(sum>=0) return n;
        while(posSum>=0 && last>=0){
            if(posSum+arr.get(last)<0) {
                break;
            }
            posSum += arr.get(last);
            last--;
        }
        return n - (last) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("ENter length : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr.add(a);
        }
        System.out.println(longestSubsequence(arr,n));
    }
}
