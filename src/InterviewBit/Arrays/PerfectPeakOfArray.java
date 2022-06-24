package InterviewBit.Arrays;

import java.util.ArrayList;

public class PerfectPeakOfArray {
    public int perfectPeak(ArrayList<Integer> A) {
        int n = A.size();
        int [] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = A.get(0);
        suf[n-1] = A.get(n-1);
        int i=1, j = n-2;
        while(i<n && j>=0){
            pre[i] = Math.max(pre[i-1],A.get(i));
            suf[j] = Math.min(suf[j+1],A.get(j));
            i++;
            j--;
        }
        for(i=1;i<n-1;i++){
            if(A.get(i)>pre[i-1] && A.get(i)<suf[i+1]) return 1;
        }
        return 0;
    }
}
