package POTD;

public class RepeatedStringMatch {
    public static int repeatedStringMatch(String a, String b) {
        // Your code goes here
        String s = a;
        int c=1;
        while(s.length()<b.length()){
            s = s.concat(a);
            c++;
        }
        if(s.contains(b)) return c;
        s = s.concat(a);
        c++;
        if(s.contains(b)) return c;
        return -1;
    }

    public static void main(String[] args) {
        int copies = repeatedStringMatch("abcd","cdabcdab");
        System.out.println("Repeat abcd "+copies+" times to get cdabcdab as substring");
    }
}
