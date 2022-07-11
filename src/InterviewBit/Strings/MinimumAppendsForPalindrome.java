package InterviewBit.Strings;

public class MinimumAppendsForPalindrome {
    public int solve(String A) {
        int um = 0;
        int ma = 0;
        int i  = 0;
        int j = A.length() - 1;

        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                um++;
                i++;
                if (ma > 0) {
                    um += ma;
                    ma = 0;
                    j = A.length() - 1;
                }
            } else {
                ma++;
                i++;
                j--;
            }
        }
        return  um;
    }
}
