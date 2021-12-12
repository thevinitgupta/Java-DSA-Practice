package POTD;

import java.util.HashMap;

public class SubarraysWithEqual1and0 {
    // O(N*N) - time limit exceeded
//    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
//    {
//        // add your code here
//        int count = 0,curr = 0;
//        for(int i=0;i<n-1;i++){
//            curr = 0;
//            for(int j=0;j<n;j++){
//                if(arr[j]==1) curr++;
//                else curr--;
//
//                if(curr==0) count++;
//            }
//        }
//        return count;
//    }

    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> cmap = new HashMap<>();
        int sum =0,count=0;
        cmap.put(0,1);
        for(int i=0;i<n;i++){
            if(arr[i]==1) sum++;
            else sum--;

            if(cmap.containsKey(sum)) {
                int curr = cmap.get(sum);
                // System.out.println("i : "+i);
                // System.out.println(sum);
                // System.out.println(curr+"\n");
                count += curr;
                curr++;
                cmap.put(sum,curr);
            }
            else {
                cmap.put(sum,1);
                //System.out.println(cmap);
            }
        }
        //System.out.println(cmap);
        return count;
    }

}
