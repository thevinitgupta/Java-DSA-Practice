package DynamicProgramming;

import java.util.Arrays;

public class SortIntegersByThePowerValue {
    static int [] dp = new int[1000000];
    public int getKth(int lo, int hi, int k) {
        int [] el = new int[(hi+1)-lo];
        for(int i=0;i<(hi-lo)+1;i++){
            el[i] = lo+i;
            getSteps(el[i]);
        }
        el = sort(el);
        return el[k-1];
    }
    public static int[] sort(int []el){
        int high = el.length;
        if(high==1) return el;
        int mid = high/2;
        return merge(sort(Arrays.copyOfRange(el,0,mid)), sort(Arrays.copyOfRange(el,mid,high)));
    }

    public static int [] merge(int [] left, int [] right){
        int i=0,j=0,k=0, m = left.length, n = right.length;
        int [] merged = new int[m+n];
        while(i<m && j<n){
            if(dp[left[i]]<dp[right[j]]){
                merged[k] = left[i];
                i++;
            }
            else if(dp[left[i]]>dp[right[j]]){
                merged[k] = right[j];
                j++;
            }
            else {
                if(left[i]<right[j]){
                    merged[k] = left[i];
                    i++;
                }
                else {
                    merged[k] = right[j];
                    j++;
                }
            }
            k++;
        }
        while(i<m){
            merged[k] = left[i];
            i++;
            k++;
        }
        while(j<n){
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }

    public static int getSteps(int val){
        if(val==1) return 0;
        if(dp[val]!=0) return dp[val];
        if(val%2==0) {
            dp[val] =  1 + getSteps(val/2);
        }
        else {
            dp[val] = 1 + getSteps(val*3 + 1);
        }
        return dp[val];
    }
}
