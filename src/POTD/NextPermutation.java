package POTD;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int j=N-1,i=N-2;
        List<Integer> perm = new ArrayList<>();
        while(j>=0 && i>=0){
            if(arr[i]<arr[j]) break;
            i--;
            j--;
        }
        int l=i+1;
        while(i>=0 && l<N && arr[l]>arr[i]) l++;
        if(i>=0) {
            int temp = arr[i];
            arr[i] = arr[l-1];
            arr[l-1] = temp;
        }

        i++;j=N-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (i = 0; i < N; i++) {
            perm.add(arr[i]);
        }
        return perm;
    }
}
