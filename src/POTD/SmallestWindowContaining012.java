package POTD;

public class SmallestWindowContaining012 {
    public int smallestSubstring(String S) {
        int n = S.length(), min = n;
        boolean found = false;
        int [] c = new int[3];
        int i = 0,j = 0;
        while(i<n && j<n){
            c[Integer.parseInt(S.charAt(j)+"")]++;
            // System.out.println(S.charAt(j)+", "+Arrays.toString(c));
            while(c[0]>=1 && c[1]>=1 && c[2]>=1){
                min = Math.min((j-i)+1, min);
                found = true;
                c[Integer.parseInt(S.charAt(i)+"")]--;
                i++;
            }
            j++;
        }
        if(!found) return -1;
        return min;
    }
}
