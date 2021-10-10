package Strings;

public class CheckIfWordOccursAsPrefix {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        int l = searchWord.length();
        String [] words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(word.length()>=l && word.substring(0,l).equalsIgnoreCase(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int count = isPrefixOfWord("I will not be a problem problem","pro");
        System.out.println(count);
    }
}
