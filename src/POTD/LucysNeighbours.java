package POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LucysNeighbours {
    public static ArrayList<Integer> Kclosest(int arr[], int n, int x, int k)
    {
        // Your code goes here
        ArrayList<Integer> neigh = new ArrayList<>();
        Arrays.sort(arr);
        int idx = 0;
        while(idx < n && arr[idx]<x){
            idx++;
        }
        idx--;
        int low = idx,high=idx+1,count=0;
        while(count<k && (low>=0 || high<n)){
            int d1 = low>=0 ? Math.abs(arr[low]-x) : Integer.MAX_VALUE;
            int d2 = high<n ? Math.abs(arr[high]-x) : Integer.MAX_VALUE;
            if(d1<d2) {
                neigh.add(arr[low]);
                low--;
            }
            else if(d2<d1){
                neigh.add(arr[high]);
                high++;
            }
            else {
                if(arr[low]<arr[high]) {
                    neigh.add(arr[low]);
                    low--;
                }
                else {
                    neigh.add(arr[high]);
                    high++;
                }
            }
            count++;
        }
        Collections.sort(neigh);
        return neigh;
    }

    public static void main(String[] args) {
        int [] arr = {10, 2, 14, 4, 7, 6};
        System.out.println(Kclosest(arr,arr.length,5,3));
    }
}
