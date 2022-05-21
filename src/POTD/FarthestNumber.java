package POTD;

public class FarthestNumber {
    static int[] farNumber(int n, int arr[])
    {
        int [] farthest = new int[n];
        for(int i=0;i<n;i++){
            farthest[i] = -1;
            for(int j=n-1;j>i;j--){
                if(arr[j]<arr[i]){
                    farthest[i] = j;
                    break;
                }
            }
        }
        return farthest;
    }
}
