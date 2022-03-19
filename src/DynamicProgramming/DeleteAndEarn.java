package DynamicProgramming;

import java.util.HashMap;

public class DeleteAndEarn {

    //my solution faster than below
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length, max = nums[0], min = nums[0];
        for(int i=0;i<n;i++){
            int curr = 0;
            if(freq.containsKey(nums[i])){
                curr = freq.get(nums[i]);
            }
            curr++;
            freq.put(nums[i],curr);
            max = Math.max(nums[i],max);
            min = Math.min(min, nums[i]);
        }
        HashMap<Integer, Integer> score = new HashMap<>();
        score.put(max, max*freq.get(max));
        return Math.max(earn(nums, freq,score, min, max), earn(nums, freq,score, min+1, max));
    }
    public static int earn(int [] nums, HashMap<Integer, Integer> freq, HashMap<Integer, Integer> score, int curr, int max){
        if(curr>max) return 0;
        while(!freq.containsKey(curr)) curr++;
        if(score.containsKey(curr)) return score.get(curr);
        score.put(curr, Math.max(curr*freq.get(curr) + + earn(nums, freq,score, curr+2, max),earn(nums, freq,score, curr+1, max)));
        return score.get(curr);
    }




    private HashMap<Integer, Integer> points = new HashMap<>();
    private HashMap<Integer, Integer> cache = new HashMap<>();

    private int maxPoints(int num) {
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return points.getOrDefault(1, 0);
        }

        if (cache.containsKey(num)) {
            return cache.get(num);
        }

        int gain = points.getOrDefault(num, 0);
        cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));
        return cache.get(num);
    }

    public int deleteAndEarnCopied(int[] nums) {
        int maxNumber = 0;

        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        return maxPoints(maxNumber);
    }
}
