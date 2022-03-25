package POTD;

import java.util.Arrays;

public class SmallestGreaterElementsInWholeArray {
    public static int[] greaterElement (int arr[], int n) {
        int [] copy = new int[n];
        for(int i = 0;i<n;i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        int [] nxt = new int[n];
        Arrays.fill(nxt,-10000000);
        for(int i=0;i<n;i++){
            int idx = bs(copy,arr[i]);
            if(idx!=n-1){
                while(idx+1<=n-1 && copy[idx]==copy[idx+1]) idx++;
                if(idx+1<n) nxt[i] = copy[idx+1];
            }
        }
        return nxt;
    }
    public static int bs(int [] arr, int t){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==t) return mid;
            else if(t>arr[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
