package InterviewBit.Strings;

public class Atoi {
    public int atoi(final String A) {
        int i = 0, length = A.length();
        long num = 0;
        boolean sign = true;

        while (i < length && A.charAt(i) == ' ')		// get rid of white space
            ++i;

        if (i == A.length())
            return 0;	// just have white space

        if (A.charAt(i) == '-') {		// negative
            sign = false;
            ++i;
        }
        else if (A.charAt(i) == '+')	// positive
            ++i;

        while (i < A.length() && A.charAt(i) >= '0' && A.charAt(i) <= '9') {
            num = Math.abs(num);
            num = num * 10 + (A.charAt(i) - '0');

            if (!sign)
                num = -num;
            if (num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            ++i;
        }
        return (int) num;
    }
}
