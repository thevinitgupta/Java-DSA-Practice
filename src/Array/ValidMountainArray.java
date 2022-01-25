package Array;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i=0,j=n-1;
        // if(n<3) return false;

        int maxInd = 0;
        while(i+1 < n && arr[i]<arr[i+1]) i++;
        if(i==0 || i==n-1) return false;

        while(i+1< n && arr[i]>arr[i+1]) i++;
        return i == n-1;
    }
}
