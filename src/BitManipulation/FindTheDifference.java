package BitManipulation;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        for(int i=0;i<s.length();i++){
            xor ^= s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            xor ^= t.charAt(i);
        }
        return (char)xor;
    }
}
