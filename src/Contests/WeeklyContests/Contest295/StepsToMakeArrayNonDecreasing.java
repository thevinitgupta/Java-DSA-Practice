package Contests.WeeklyContests.Contest295;
import java.util.*;

public class StepsToMakeArrayNonDecreasing {
    public int totalSteps(int[] nums) {
        int count = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        HashMap<Integer, Boolean> map = getMap(arr);
        while(map.size()!=0){
            count++;
            for(Integer key : map.keySet()){
                arr.set(key,-1);
            }
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==-1) {
                    arr.remove(i);
                    i--;
                }
            }
            //System.out.println(count+"=>"+arr);
            map = getMap(arr);
        }
        return count;
    }
    public static HashMap<Integer, Boolean> getMap(List<Integer> arr){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)> arr.get(i)){
                map.put(i,true);
            }
        }
        return map;
    }
}
