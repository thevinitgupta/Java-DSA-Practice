package InterviewBit.Strings;

public class LengthOfLastWord {
    public int lengthOfLastWord(final String A) {
        int idx = A.length() - 1;
        while (idx >= 0 && A.charAt(idx) == ' ') {
            idx--;
        }
        int count = 0;
        while (idx >= 0 && A.charAt(idx) != ' ') {
            idx--;
            count++;
        }
        return count;
    }
}
