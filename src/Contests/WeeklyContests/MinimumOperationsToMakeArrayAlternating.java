package Contests.WeeklyContests;

import java.util.HashMap;

public class MinimumOperationsToMakeArrayAlternating {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> evenmap = new HashMap<>();
        HashMap<Integer, Integer> oddmap = new HashMap<>();

        int len=nums.length;
        int val1=0,val2=0;
        int even=0,odd=0;
        int even1=-1,odd1=-1;

        for(int i=0;i<len;i++){
            if(i%2==0){
                int val=0;
                if(evenmap.containsKey(nums[i]))
                    val=evenmap.get(nums[i]);
                val++;
                if(val1<val){val1=val;even=nums[i];}
                evenmap.put(nums[i],val);
            }
            else{
                int val=0;
                if(oddmap.containsKey(nums[i]))
                    val=oddmap.get(nums[i]);
                val++;
                if(val2<val){val2=val;odd=nums[i];}
                oddmap.put(nums[i],val);
            }
        }
        if(even!=odd)
            return changing(nums,even,odd);

        int max=0;
        for (int key : evenmap.keySet()) {
            if(max<evenmap.get(key) && key!=even){even1=key;max=evenmap.get(key);}
        }

        max=0;
        for (int key : oddmap.keySet()) {
            if(max<oddmap.get(key) && key!=odd){odd1=key;max=oddmap.get(key);}
        }

        int value1=changing(nums,even1,odd);
        int value2=changing(nums,even,odd1);

        return value1<value2?value1:value2;


    }
    public static int changing(int []nums,int even,int odd){
        int len =nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                if(nums[i]!=even)count++;
            }
            else{
                if(nums[i]!=odd) count++;
            }
        }
        return count;
    }
}
