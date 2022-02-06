package Contests.WeeklyContests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEvenAndOddIndicesIndependently {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        List<Integer> ev = new ArrayList<>();
        List<Integer> od = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0) ev.add(nums[i]);
            else od.add(nums[i]);
            nums[i]=0;
        }
        Collections.sort(ev);
        Collections.sort(od);
        int c = 0,el = ev.size(),j=0,k=od.size()-1;
        while(c+1<n){
            if(j<el) nums[c] = ev.get(j);
            if(k>=0) nums[c+1] = od.get(k);
            c= c+2;
            j++;
            k--;
        }
        if(c<n && j<el) {
            nums[c] = ev.get(j);
            c++;
            j++;
        }
        if(c<n && k>=0) {
            nums[c] = od.get(k);
            c++;
            k--;
        }
        return nums;
    }
}
