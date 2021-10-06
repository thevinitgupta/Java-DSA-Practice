package POTD;

public class EditDistance {

    //working but time limit exceeded
//    public static int editDistance(String s, String t) {
//        // Code here
//        int count = 0;
//        int i=0,j=0;
//        while(i<s.length() && j<t.length()){
//            if(s.charAt(i)==t.charAt(j)) {
//                i++;j++;
//            }
//            else {
//                if(i+1 < s.length() && j+1 < t.length() && s.charAt(i+1)==t.charAt(j+1)){
//                    count++;
//                    i++;
//                    j++;
//                }
//                else if(j+1 < t.length() && s.charAt(i)==t.charAt(j+1)) {
//                    count++;
//                    j++;
//                }
//                while(i+1 < s.length() && j+1 < t.length() && s.charAt(i+1)!=t.charAt(j+1)){
//                    count++;
//                    i++;
//                }
//            }
//        }
//        //handle for extra chars at end for both strings
//        if(i<s.length()){
//            count += s.length()-i;
//        }
//        if(j<t.length()){
//            count += t.length()-j;
//        }
//        return count;
//    }

    //dp solution
    static int min(int x, int y, int z)
    {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }

    public static int editDistance(String s, String t) {
        // Code here
        int m = s.length(), n = t.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    dp[i][j] = j;
                else if (j == 0)
                    dp[i][j] = i;
                else if (s.charAt(i - 1)== t.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + min(dp[i][j - 1],dp[i - 1][j],dp[i - 1][j - 1]);
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        int dist = editDistance("gessseksss","geaek");
        System.out.println(dist);
    }
}
