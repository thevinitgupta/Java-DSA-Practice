package DynamicProgramming;

public class MaxScoreSightSeeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int maxEnd = values[n-1]-(n-1);
        int max = Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            max = Math.max(max, (values[i]+i)+maxEnd);
            maxEnd = Math.max(maxEnd, values[i]-i);
        }
        return max;
    }
}
