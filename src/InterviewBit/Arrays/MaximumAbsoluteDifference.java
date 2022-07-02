package InterviewBit.Arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {
    //Approach here 👇👇
    /*
    *
    * Here we have f(i, j) = |A[i] - A[j]| + |i-j|
The 4 possible cases here are:

Case 1:
i>j and A[i] > A[j]:
f(i,j) can be rewritten as: (A[i]+i) - (A[j]+j)

Case 2:
i<j and A[i] < A[j]:
f(i,j) can be rewritten as: (A[j]+j) - (A[i]+i)

Case 3:
i<j and A[i] > A[j]:
f(i,j) can be rewritten as: (A[i] - i) - (A[j] - j)

Case 4:
i>j and A[i] < A[j]:
f(i,j) can be rewritten as: (A[j] - j) - (A[i] - i)

The 4 noticeable things to compute here are:
1. Maximum1 = max(A[i]+i)
2. Minimum1 = min(A[i]+i)
3. Maximum2 = max(A[i]-i)
4. Minimum2 = min(A[i]-i)

The function needs to return max(Maximum1 - Minimum1, Maximum2 - Minimum2)

Because this would go through all the possible cases, find the highest value of the function and return the best values for (A[i]+i) and (A[i]-i), and the max of these 2 would be the answer :slight_smile:
    * */
    public int maxArr(ArrayList<Integer> arr) {
        int n = arr.size();
        if(n==1){
            return 0;
        }
        int ma1 = Integer.MIN_VALUE, ma2 = Integer.MIN_VALUE, mi1 = Integer.MAX_VALUE, mi2 = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ma1 = Math.max(arr.get(i)+i,ma1);
            ma2 = Math.max(arr.get(i)-i,ma2);
            mi1 = Math.min(arr.get(i)+i,mi1);
            mi2 = Math.min(arr.get(i)-i,mi2);
        }

        return Math.max(ma1-mi1, ma2-mi2);
    }
}
