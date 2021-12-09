package POTD;
import java.util.*;
public class SecretCipher {
    void fillArray(String s, int[] a) {
        a[0] = 0;
        for (int i = 1; i<s.length(); i++) {
            int series = a[i - 1];
            while (series > 0) {
                if (s.charAt(series) == s.charAt(i)) {
                    a[i] = series + 1;
                    break;
                }
                series = a[series - 1];
            }
            if (series == 0) {
                if (s.charAt(i) == s.charAt(0))
                    a[i] = 1;
                else
                    a[i] = 0;
            }
        }
    }
    public String compress(String s) {
        // Your code goes  here
        int[] a = new int[s.length()];

        fillArray(s, a);

        Stack<Character> shortened = new Stack<Character>();

        for (int i = s.length() - 1; i > 0; i--) {
            if (i % 2 == 0) {
                shortened.push(s.charAt(i));
                continue;
            }
            boolean star_here = false;
            int suffix = a[i];
            int substrlen = i + 1;
            if (suffix * 2 >= substrlen)
                if (substrlen % (substrlen - suffix) == 0)
                    if ((substrlen / (substrlen - suffix)) % 2 == 0)
                        star_here = true;

            // adding * to stack and moving index as required
            if (star_here == true) {
                shortened.push('*');
                i = i / 2 + 1;
            }
            else
                shortened.push(s.charAt(i));
        }

        StringBuilder ret = new StringBuilder();
        ret.append(s.charAt(0));
        while (!shortened.empty()) {
            ret.append(shortened.peek());
            shortened.pop();
        }

        return ret.toString();
    }
}
