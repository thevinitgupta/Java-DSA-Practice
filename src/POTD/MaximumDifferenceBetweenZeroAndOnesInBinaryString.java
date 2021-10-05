package POTD;

import java.util.Arrays;

public class MaximumDifferenceBetweenZeroAndOnesInBinaryString {

    //DP Solution - Time Limit Exceeded
//    static final int MAX=100;
//    static boolean allones(String s, int n)
//    {
//        int co = 0;
//        for (int i = 0; i < s.length(); i++)
//            if(s.charAt(i) == '1')
//                co +=1;
//
//        return (co == n);
//    }
//
//    static int findlength(int arr[], String s, int n,
//                          int ind, int st, int dp[][])
//    {
//        if (ind >= n)
//            return 0;
//        if (dp[ind][st] != -1)
//            return dp[ind][st];
//
//        if (st == 0)
//            return dp[ind][st] = Math.max(arr[ind] +
//                            findlength(arr, s, n,
//                                    ind + 1, 1, dp),
//                    findlength(arr, s, n,
//                            ind + 1, 0, dp));
//
//        else
//            return dp[ind][st] = Math.max(arr[ind] +
//                    findlength(arr, s, n,
//                            ind + 1, 1, dp), 0);
//    }
//    static int maxSubstring(String s) {
//        // code here
//        int n = s.length();
//        if (allones(s, n))
//            return -1;
//
//        // Else find the length.
//        int arr[] = new int[MAX];
//        for (int i = 0; i < n; i++)
//            arr[i] = (s.charAt(i) == '0' ? 1 : -1);
//
//        int dp[][] = new int[MAX][3];
//        for (int[] row : dp)
//            Arrays.fill(row, -1);
//        return findlength(arr, s, n, 0, 0, dp);
//    }

    static int maxSubstring(String S) {
        // code here
        int n=S.length();
        int max=0;
        int count =0;
        int j=0;

        for (int i=0;i<n ;i++ ) {

            if(S.charAt(i)=='0')
                count++;
            else
                count--;

            if(count < 0)
                count=0;

            else if(count>max)
                max=count;


        }
        if (max==0)
            return -1;
        return max;
    }
    public static void main(String[] args) {
        int maxDiffernce = maxSubstring("1101");
        System.out.println("Max Difference : "+maxDiffernce);
    }
}
