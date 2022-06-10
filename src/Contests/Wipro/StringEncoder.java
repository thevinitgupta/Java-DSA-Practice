package Contests.Wipro;

public class StringEncoder {
    public static String[] encoder(String[] input1, int input2){
        String [] ans = new String[input1.length];
        for(int i=0;i<input1.length;i++){
            String curr = getWord(input1[i]);
            ans[i] = repWord(curr,input2);
        }
        return ans;
    }
    public static String getWord(String str){
        int mid = 0+(str.length())/2;
        String res = "" + str.charAt(0)+str.charAt(mid)+str.charAt(str.length()-1);
        return res;
    }
    public static String repWord(String s,int count){
        String res = s;
        while(count>0){
            res+=s;
            count--;
        }
        return res;
    }
}
