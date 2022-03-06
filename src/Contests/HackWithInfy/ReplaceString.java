package Contests.HackWithInfy;

public class ReplaceString {
    public static int replaceString(String str){
        int count = 1;
        int i=0,j=0,n = str.length();
        while(i<n && j<n){
            if(str.charAt(i)=='2' || str.charAt(i)=='3'){
                int c = 1;
                while(str.charAt(i)==str.charAt(j)) {
                    j++;
                    c++;
                }
                if(c>1) {
                    count = (count* c)%1000000007;
                }
                i=j;
                j=i;
            }
            else {
                i++;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(replaceString("3"));
    }
}
