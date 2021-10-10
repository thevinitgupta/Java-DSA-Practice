package Strings;

public class MaxNumOfStringWithAllChars {
    public static int numberOfSubstrings(String s) {
        int [] cArr = new int[3];
        int tot=0,i=0,j=0;
        int n = s.length();
        while(j<n){
            int c = s.charAt(j) - 'a';
            System.out.println("char at j = "+c);
            cArr[c]++;
            if(cArr[0]>0 && cArr[1]>0 && cArr[2]>0){
                tot++;
                System.out.println(tot);
            }
            System.out.println(i + " -> " +j);
            j++;
        }
        while(i<n){
            int c = s.charAt(i) - 'a';
            System.out.println("char at j = "+c);
            cArr[c]--;
            if(cArr[0]>0 && cArr[1]>0 && cArr[2]>0){
                tot++;
                System.out.println(tot);
            }
            System.out.println(i + " -> " +j);
            i++;
        }
        return tot;
    }

    public static void main(String[] args) {
        int tot = numberOfSubstrings("abcabc");
        System.out.println(tot);
    }
}
