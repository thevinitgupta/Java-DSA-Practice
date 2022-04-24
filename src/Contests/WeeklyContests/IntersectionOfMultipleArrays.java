package Contests.WeeklyContests;

import java.util.*;

public class IntersectionOfMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> intersec = new ArrayList<>();
        HashMap<Integer,Integer> present = new HashMap<>();
        int min = 1,max = 1000;
        for(int i=0;i<nums[0].length;i++){
            present.put(nums[0][i],1);
            min = Math.min(nums[0][i],min);
            max = Math.max(nums[0][i],max);
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(present.containsKey(nums[i][j])){
                    present.put(nums[i][j], present.get(nums[i][j])+1);
                    min = Math.min(nums[i][j],min);
                    max = Math.max(nums[i][j],max);
                }
            }
        }
        // System.out.println(present);
        for(int i=min;i<=max;i++){
            if(present.containsKey(i) && present.get(i)==nums.length) intersec.add(i);
        }
        return intersec;
    }
}
