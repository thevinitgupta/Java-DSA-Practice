package Strings;

public class NumberOfSubstringsContainingAllCharacters {
    public static int numberOfSubstrings(String s) {
        int count = 0;
        int la = -1,lb = -1, lc = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') la = i;
            else if(s.charAt(i)=='b') lb = i;
            else lc = i;
            if(la!=-1 && lb !=-1 && lc !=-1) {
                count += 1 + Math.min(la,Math.min(lb,lc));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = numberOfSubstrings("aaacb");
        System.out.println(count);
    }
}
