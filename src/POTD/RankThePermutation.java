package POTD;

import java.util.Arrays;

public class RankThePermutation {
    public long findRank(String str)
    {
        long[] fact = new long[20];
        fact[0] = 1l;
        long p = 1l;
        for(int i=2; i<=18; i++) {
            p *= i;
            fact[i-1] = p;
        }

        int len = str.length();
        long mul = fact[len-1];
        long rank = 1l;
        long[] count = new long[26];

        Arrays.fill(count,0l);

        for (int i = 0; i<len; ++i)
            ++count[str.charAt(i)-'a'];

        for (int i = 1; i<26; ++i)
            count[i] += count[i-1];

        for (int i = 0; i < len; ++i) {
            mul /= (len - i);

            int x = (str.charAt(i) - 'a') - 1;
            if(x>=0)
                rank += count[x] * mul;
            for (int j = str.charAt(i)-'a'; j<26; ++j)
                --count[j];
        }

        return rank;
    }
}
