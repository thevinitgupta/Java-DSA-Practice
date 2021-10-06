package POTD;

public class EditDistance {
    public static int editDistance(String s, String t) {
        // Code here
        int count = 0;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)) {
                i++;j++;
            }
            else {
                if(i+1 < s.length() && j+1 < t.length() && s.charAt(i+1)==t.charAt(j+1)){
                    count++;
                    i++;
                    j++;
                }
                else if(j+1 < t.length() && s.charAt(i)==t.charAt(j+1)) {
                    count++;
                    j++;
                }
                while(i+1 < s.length() && j+1 < t.length() && s.charAt(i+1)!=t.charAt(j+1)){
                    count++;
                    i++;
                }
            }
        }
        //handle for extra chars at end for both strings
        if(i<s.length()){
            count += s.length()-i;
        }
        if(j<t.length()){
            count += t.length()-j;
        }
        return count;
    }

    public static void main(String[] args) {
        int dist = editDistance("gessseksss","geaek");
        System.out.println(dist);
    }
}
