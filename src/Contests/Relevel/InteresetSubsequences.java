package Contests.Relevel;

import java.util.*;
import java.util.stream.IntStream;

public class InteresetSubsequences {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            String str = sc.nextLine();
            String [] sa = str.split(" ");
            int n = Integer.parseInt(sa[0]);
            int m = Integer.parseInt(sa[1]);
            int [] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = Integer.parseInt(sc.nextLine());
            }
            int [] getMax = getMax(arr,n,m);
            int s = 0;
            for(int j=0;j<getMax.length;j++){
                s += getMax[j];
            }
            System.out.println(s);
        }
    }
    public static int[] getMax(int [] nums, int n, int k){

        int [] ref = Arrays.copyOf(nums,n);
         HashMap<Integer, TreeSet<Integer>> map = new HashMap<Integer, TreeSet<Integer>>();
        IntStream.range(0,n).forEach(i ->
                map.computeIfAbsent(nums[i],key -> new TreeSet<Integer>()).add(i));
         Arrays.sort(nums);
         int [] idxes = new int[k];

         for(int i = n-1; i>= n-k; k--){
             TreeSet<Integer> set = map.get(nums[i]);
             idxes[n-i-1] = set.pollFirst();
         }
         return Arrays.stream(idxes).sorted().map(i -> ref[i]).toArray();
    }
}
