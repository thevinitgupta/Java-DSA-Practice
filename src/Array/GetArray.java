package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetArray {
    static void rearrange(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) neg.add(arr[i]);
            else pos.add(arr[i]);
        }
        int c = 0;
        for(int i=0;i<neg.size();i++){
            arr[c] = neg.get(i);
            c++;
        }
        for(int i=0;i<pos.size();i++){
            arr[c] = pos.get(i);
            c++;
        }
    }

    public static void main(String[] args) {
        int [] arr = {-3,6,4,-10,1};
        rearrange(arr);
    }
}
