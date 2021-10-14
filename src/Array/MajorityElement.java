package Array;

import java.util.HashMap;

public class MajorityElement {
    static int majorityElement(int [] a, int size)
    {
        // your code here
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<size;i++){
            if(count.containsKey(a[i])){
                int curr = count.get(a[i]);
                curr++;
                if(curr > (size/2)) return a[i];
                else count.put(a[i],curr);
            }
            else count.put(a[i],1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,8,3,2};
        System.out.println(majorityElement(arr,5));
    }
}
