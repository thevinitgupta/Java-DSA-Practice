package POTD;

import java.util.ArrayList;
import java.util.Arrays;

public class HungryPizzaLovers {
    public static ArrayList<Integer> permute (int arr[][], int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            arr[i][0] = arr[i][0] + arr[i][1];
            arr[i][1] = i+1;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        for(int i=0;i<n;i++){
            list.add(arr[i][1]);
        }

        return list;
    }
}
