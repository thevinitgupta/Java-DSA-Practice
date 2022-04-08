package POTD;
import java.util.HashMap;

public class NextElementWithGreaterFrequency {
    static int[] print_next_greater_freq(int arr[], int n)
    {
        int[] a= new int[n];
        HashMap<Integer,Integer> o1 = new HashMap<>();
        for(int i=0;i<n;i++){
            if(o1.containsKey(Integer.valueOf(arr[i]))){
                o1.put(arr[i],o1.get(arr[i])+1);
            }
            else
                o1.put(arr[i],1);
        }
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(o1.get(arr[j])>o1.get(arr[i])){
                    a[i]=arr[j];
                    break;
                }
            }
            if(j==n)
                a[i]=-1;
        }
        return a;
    }
}
