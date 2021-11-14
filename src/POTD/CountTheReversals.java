package POTD;

public class CountTheReversals {
    int countRev (String s)
    {
        // your code here
        if (s.length () % 2 == 1) return -1;

        int op = 0, cl = 0;

        int res = 0; // ans
        for (int i = 0; i < s.length (); ++i)
        {
            if (s.charAt (i) == '{') op++;
            else cl++;


            if (cl > op)
            {
                res += cl - op;
                int temp = cl;
                cl = op;
                op = temp;
            }
        }

        res += (Math.abs (cl - op)) / 2;
        return res;
    }
}
