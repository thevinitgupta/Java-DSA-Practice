package Strings;

public class SplitAStringInBalancedString {
    public static int balancedStringSplit(String s) {
        int c = 0,count=1;
        for(int i=0;i<s.length();i++){
            if(c==0 && i>0){
                count++;
            }
            if(s.charAt(i)=='L') c++;
            else c--;
        }
        return count;
    }

    public static void main(String[] args) {
        int c = balancedStringSplit("LRLLRRLRRLL");
        System.out.println(c);
    }
}
