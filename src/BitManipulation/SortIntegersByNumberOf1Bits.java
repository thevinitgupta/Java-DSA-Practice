package BitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pair {
    int num,bits;
    Pair(int n, int b){
        this.num = n;
        this.bits = b;
    }
}
public class SortIntegersByNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        List<Pair> nums = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count = 0, cpy = arr[i];
            while(cpy!=0){
                cpy &= cpy-1;
                count++;
            }
            nums.add(new Pair(arr[i], count));
        }
        Collections.sort(nums, (a, b)->{
            if(a.bits==b.bits) return a.num-b.num;
            return a.bits-b.bits;
        });
        for(int i=0;i<nums.size();i++){
            arr[i] = nums.get(i).num;
        }
        return arr;
    }
}
