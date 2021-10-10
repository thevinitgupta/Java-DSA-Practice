package POTD;

import java.util.Arrays;
//[-85, -34, -34, -12, -10, -3, 4, 4, 6, 7, 11, 12, 16, 19, 23, 25, 25, 45, 47, 56, 77, 77, 88]
public class ValidPairSum {
    static long ValidPair(int [] a, int n)
    {
        // Your code goes here
        if(n==1) return 0;
        long count = 0;
        Arrays.sort(a);
        int i=0,j=n-1;
        while(i<j){
            System.out.println(a[i]+" <--> "+a[j]);
            if(a[j]+a[i]>0){
                count += j-i;
                j--;
                System.out.println(count+" and decrease j");
            }
            else {
                i++;
                System.out.println(count+" does not increase and increase i");
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int [] arr = {-3,6,12,77,-34,23,4,16,-12,56,11,4,7,19,77,-34,-10,45,25,88,25,47,-85};

        long count = ValidPair(arr,arr.length);
        System.out.println(count);
    }
}
