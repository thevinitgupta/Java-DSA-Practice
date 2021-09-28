package Strings;

public class ReplaceAllDigitsWithCharacters {
    public static String replaceDigits(String s) {
        int n = s.length();
        if(n==1) return s;
        StringBuilder str = new StringBuilder(n);

        int i=0,j=1;
        while(i<n && j<n){
            int add = s.charAt(j)-'0';
            add = add+ (int)s.charAt(i);

            str.append(s.charAt(i));
            str.append((char)add);
            i=i+2;
            j=j+2;
        }
        if(i==n-1) str.append(s.charAt(n-1));
        return str.toString();
    }

    public static void main(String[] args) {
        String s = replaceDigits("a1b1c1e");
        System.out.println(s);
    }
}
