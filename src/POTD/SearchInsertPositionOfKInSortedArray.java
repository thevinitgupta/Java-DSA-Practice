package POTD;

public class SearchInsertPositionOfKInSortedArray {
    static int searchInsertK(int Arr[], int N, int k)
    {
        int ind=0;
        for(int i=0;i<N;i++){
            if(Arr[i]>k){
                return i;
            }
            else if(Arr[i]==k) return i;
        }
        return N;
    }
}
