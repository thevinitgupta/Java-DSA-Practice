package POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
* Input: n = 4
arr = {1, 2, 3, 4}
q = 2
queries = {1, 4, 2, 3}
Output: 10 5
Explaination: In the first query we need sum
from 1 to 4 which is 1+2+3+4 = 10. In the
second query we need sum from 2 to 3 which is
2 + 3 = 5.
* */

public class SumOfQuery2 {
    static List<Integer> querySum(int n, int [] arr, int q, int [] queries)
    {
        List<Integer> sums = new ArrayList<>();
        int [] s = new int [n];
        s[0] = arr[0];
        for(int i=1;i<n;i++){
           s[i] = s[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(queries));
        for(int j=1;j<queries.length;j = j+2){
            int q2 = queries[j];
            int q1 = queries[j-1];
            int sum = s[q2-1];
            if(q1-2 >=0) sum = sum - s[q1-2];
            sums.add(sum);
        }
        return sums;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        //[1, 3, 6, 10]
        int [] queries = {1,4,2,3};
        List<Integer> sums = querySum(4,arr,3,queries);
        System.out.println("Sums of queries : ");
        for(int i=0;i<sums.size();i++){
            System.out.println(i+" : "+sums.get(i));
        }
    }
}
