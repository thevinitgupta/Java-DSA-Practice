package Strings;

public class CheckIfWordEqualsSumOfTwoWords {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int fVal = sValue(firstWord);
        int sVal = sValue(secondWord);
        int tVal = sValue(targetWord);
        return (fVal+sVal)==tVal;
    }
    static int sValue(String word){
        StringBuilder s = new StringBuilder(word.length());
        for(int i=0;i<word.length();i++){
            int v = word.charAt(i)-'a';
            s.append(v);
        }
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        boolean isEqual = isSumEqual("ab","cba","cdb");
        System.out.println(isEqual);
    }
}
