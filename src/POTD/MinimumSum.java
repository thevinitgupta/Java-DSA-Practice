package POTD;

import java.util.Arrays;

public class MinimumSum {
    String solve(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        StringBuilder sum = new StringBuilder();
        int i=n-2,j=n-1,carry = 0;
        while(i>=0 || j>=0){
            int a = 0,b=0;
            if(i>=0)
                a = arr[i];
            if(j>=0)
                b = arr[j];
            int s = a+b+carry;
            int add = s%10;
            if(s!=0)
                sum.insert(0,add);
            carry = (s-add)/10;
            i = i-2;
            j = j-2;
        }
        if(carry>0) sum.insert(0,carry);
        return sum.toString();
    }
}
