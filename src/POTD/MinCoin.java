package POTD;

import java.util.Arrays;

public class MinCoin {
    public int MinCoin(int[] nums, int amount)
    {
        // Code here
        int[]res = new int[amount+1];

        Arrays.fill(res, Integer.MAX_VALUE);
        res[0]=0;

        for(int i=1; i<=amount;i++)
        {
            for(int j : nums)
            {
                if(i-j>=0 && res[i-j]!=Integer.MAX_VALUE)
                {
                    res[i] = Math.min(res[i], res[i-j]+1);
                }
            }
        }
        if(res[amount]==Integer.MAX_VALUE)
        {
            return -1;
        }
        return res[amount];
    }
}
