package POTD;

public class FindMissingAndRepeatingCharacters {
    int[] findTwoElement(int arr[], int n) {
        int [] res = new int[2];
        for(int i=0;i<n;i++){
            int idx = Math.abs(arr[i])-1;
            if(arr[idx]<0) res[0] = idx+1;
            else arr[idx] = -arr[idx];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0) res[1] = i+1;
        }
        return res;
    }
}
