package POTD;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
    static boolean isIt(int []arr,int mid,int days){
        int count=0;
        int i=0;
        while(i<arr.length){
            count+=arr[i];
            if(count>mid){
                days--;
                if(days<=0) return false;
                count=0;
            }
            else ++i;
        }
        return true;
    }
    static int leastWeightCapacity(int[] arr, int N, int D) {
        int right= Arrays.stream(arr).sum();
        int left=0,ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isIt(arr,mid,D)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}
