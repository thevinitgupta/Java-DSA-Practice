package Array;

import java.util.Scanner;

public class CountCommonSubsequences {
    public static int countCommon(int []arr1, int [] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int dp[][] = new int [n1+1][n2+1];

        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= n1; i++) {

            for (int j = 1; j <= n2; j++) {

                int c1 = arr1[i - 1];
                int c2 = arr2[j - 1];
                if (c1 == c2)
                    dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1];
            }
        }

        return dp[n1][n2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n1 =0, n2 = 0,div = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') div = i;
        }
        n1 = Integer.parseInt(str.substring(0,div));
        n2 = Integer.parseInt(str.substring(div+1));
        String a[] = sc.nextLine().split(" ");
        String b[] = sc.nextLine().split(" ");
        int [] arr1 = new int[a.length];
        int [] arr2 = new int[b.length];
        for(int i=0;i<a.length;i++){
            arr1[i] = Integer.parseInt(a[i].trim());
        }
        for(int i=0;i<b.length;i++){
            arr2[i] = Integer.parseInt(b[i].trim());
        }
        long mod = 1000000007;
        System.out.println(countCommon(arr1, arr2)%mod);
    }
}
